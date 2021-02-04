/*
 * Copyright (c) 2020-2021 Ahmet Erdinç Yılmaz -- <ahmeterdinc09@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 */
package com.karalisoft.generator

import com.karalisoft.scad.Cube
import com.karalisoft.scad.Cylinder
import com.karalisoft.scad.Difference
import com.karalisoft.scad.Intersection
import com.karalisoft.scad.Model
import com.karalisoft.scad.Module
import com.karalisoft.scad.Rotate
import com.karalisoft.scad.Scale
import com.karalisoft.scad.Shape
import com.karalisoft.scad.Sphere
import com.karalisoft.scad.SphereParams
import com.karalisoft.scad.TransformedShape
import com.karalisoft.scad.Translate
import com.karalisoft.scad.Union
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.karalisoft.scad.ModuleOrFunctionCall
import com.karalisoft.validation.ScadValidator
import com.karalisoft.scad.TransformedModuleOrFunctionCall

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ScadGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		if (resource.contents.length == 1) {
			val Model model = resource.contents.get(0) as Model;
			fsa.generateFile(resource.fileNameRelativeToProjectName + ".pov", generateFileContent(model.blocks.filter [ bl |
				bl instanceof Module
			], resource.fileName))
		} else {
			throw new RuntimeException("esource.contents.length != 1")
		}
	}

	protected def String generateFileContent(Iterable<EObject> modules, String fileNameWithoutExtension) {
		'''
			«modules.generateModules»
			«generateScadCamera»
			«generateScadLightSources»
			«generateScadBackGround»
			«generateHelperFilesContentsAsComment(fileNameWithoutExtension)»
			«generateAxes»
		'''
	}

	protected def String generateScadCamera() {
		'''
			#macro
			    openscad_camera_angle(w ,h) (11*pow(w/h,0.5))
			#end // OpenSCAD camera angle is dependent on view port aspect ratio. Formula is an estimation"
			
			#macro 
				«ScadValidator.SCAD_CAMERA_MODULE_NAME»(openscad_vpt, openscad_vpr, openscad_vpd, openscad_vpw, openscad_vph)
				camera {
				    orthographic
				    location <0,0,openscad_vpd>
				    right <-openscad_vpw/openscad_vph,0,0>
				    angle openscad_camera_angle(openscad_vpw,openscad_vph)
				    up    <0,1.33,0>
				    rotate openscad_vpr
				    translate openscad_vpt
				    look_at <0,0,0>
				}
			#end
		'''
	}

	protected def String generateScadLightSources() {
		'''
			#macro 
				«ScadValidator.SCAD_LIGHT_SOURCES_NAME»(openscad_vpt, openscad_vpr, openscad_vpd)
				light_source {
					<-1,1,1>*openscad_vpd color rgb <1,1,1> 
					rotate openscad_vpr 
					translate openscad_vpt 
				} 
				light_source {
					<1,-1,-1>*openscad_vpd color rgb <1,1,1> 
					rotate openscad_vpr 
					translate openscad_vpt 
				} 
			#end
		'''
	}

	protected def String generateScadBackGround() {
		'''
			#macro «ScadValidator.SCAD_BACK_GROUND_NAME»()
			    #include "coordinates.pov"
			    #declare openscad_cornfield = color rgb <1,1,0.898039>;
			    #declare openscad_metalic = color rgb <0.666667,0.666667,1>;
			    #declare openscad_sunset = color rgb <0.666667,0.266667,0.266667>;
			    background { openscad_cornfield } 
			    #default { texture { pigment { rgb <1,1,0> } finish { ambient 0.15 diffuse 0.85 }  }  } 
			#end
		'''
	}

	protected def String generateAxes() {
		'''
			#macro «ScadValidator.SCAD_AXES»(axe_length)
			    object { 
			        AxisXYZ( axe_length, axe_length, axe_length, Tex_Dark, Tex_White)
			    }
			#end
		'''
	}

	def String generateHelperFilesContentsAsComment(String fileNameWithoutExtension) {
		'''
			/*
			
			
			************ «fileNameWithoutExtension»_test.ini ************
			Width=1600
			Height=1200
			Input_File_Name="«fileNameWithoutExtension»_test.pov"
			Antialias=On
			Antialias_Threshold=0.1
			Display=On
			
			
			************ «fileNameWithoutExtension»_test.sh ************
			povray  -L${POVRAY_SCAD_LIB} «fileNameWithoutExtension»_test.ini
			
			
			
			*/
		'''
	}

	protected def String generateModules(Iterable<EObject> modules) {
		'''
			«FOR m : modules»
				«val module = m as Module»
				#macro «module.name»()
					«FOR eo:module.blocks»
						«IF eo instanceof Shape»
							«val shape = eo as Shape»
							«shape.impl.generate»
						«ENDIF»
						«IF eo instanceof TransformedModuleOrFunctionCall»
							«val shape = eo as TransformedModuleOrFunctionCall»
							«shape.generate»
						«ENDIF»
					«ENDFOR»
				#end
			«ENDFOR»
		'''
	}

	def dispatch String generate(Sphere sphere) {
		'''
			sphere {
				«val r = sphere.sphereParams.sphereR» 
				«val d = sphere.sphereParams.sphereD» 
				<0,0,0>«IF (r!==null)»,«r»«ENDIF»«IF (r===null && d!==null)»,«d/2»«ENDIF» «IF (r===null && d===null)»,«1»«ENDIF»
			}		
		'''
	}

	def Double getSphereR(EList<SphereParams> sphereParams) {
		return sphereParams?.findFirst[sp|sp.r !== null]?.r;
	}

	def Double getSphereD(EList<SphereParams> sphereParams) {
		return sphereParams?.findFirst[sp|sp.d !== null]?.d;
	}

	def dispatch String generate(Cube cube) {
		'''
			«val cubeSize = cube.cubeSize»
			box { 
				«IF (cube.isCubeCentered)»
					<«-cubeSize.x/2»,«-cubeSize.y/2»,«-cubeSize.z/2»>,<«cubeSize.x/2»,«cubeSize.y/2»,«cubeSize.z/2»>
				«ELSE»
					<0,0,0>,<«cubeSize.x»,«cubeSize.y»,«cubeSize.z»>
				«ENDIF»	
			}
		'''
	}

	def boolean isCubeCentered(Cube cube) {
		val isCenter = cube.cubeParams.findLast[cp|cp.center !== null];
		isCenter !== null && 'true'.equals(isCenter.center)
	}

	def CubeSize getCubeSize(Cube cube) {
		val lastSize = cube.cubeParams.findLast [
			size !== null || (x !== null && z !== null && y !== null)
		]

		if (lastSize === null) {
			new CubeSize(1d, 1d, 1d);
		} else if (lastSize.size !== null) {
			new CubeSize(lastSize.size, lastSize.size, lastSize.size);
		} else {
			new CubeSize(lastSize.x, lastSize.y, lastSize.z);
		}
	}

	@FinalFieldsConstructor
	static class CubeSize {
		val Double x;
		val Double y;
		val Double z;
	}

	def dispatch String generate(Cylinder cylinder) {
		'''
			cone { 
				«val isCentered = cylinder.isCylinderCentered»
				«val h = cylinder.cylinderH»
				«val r1 = cylinder.cylinderR1»
				«val r2 = cylinder.cylinderR2»
				«IF isCentered»
					<0,0,«-h/2»>,«r1»
					<0,0,«h/2»>,«r2»
				«ELSE»
					<0,0,«0»>,«r1»
					<0,0,«h»>,«r2»
				«ENDIF»		
			}
		'''
	}

	def double getCylinderH(Cylinder cylinder) {
		val h = cylinder.cylinderParams.findLast[h !== null];

		if (h !== null) {
			h.h
		} else {
			1d
		}
	}

	def double getCylinderR1(Cylinder cylinder) {
		val r = cylinder.cylinderParams.findLast[r !== null];
		val r1 = cylinder.cylinderParams.findLast[r1 !== null];
		val d = cylinder.cylinderParams.findLast[d !== null];
		val d1 = cylinder.cylinderParams.findLast[d1 !== null];

		if (r !== null) {
			r.r
		} else if (r1 !== null) {
			r1.r1
		} else if (d !== null) {
			d.d / 2
		} else if (d1 !== null) {
			d1.d1 / 2
		} else {
			1d
		}
	}

	def double getCylinderR2(Cylinder cylinder) {
		val r = cylinder.cylinderParams.findLast[r !== null];
		val r2 = cylinder.cylinderParams.findLast[r2 !== null];
		val d = cylinder.cylinderParams.findLast[d !== null];
		val d2 = cylinder.cylinderParams.findLast[d2 !== null];

		if (r !== null) {
			r.r
		} else if (r2 !== null) {
			r2.r2
		} else if (d !== null) {
			d.d / 2
		} else if (d2 !== null) {
			d2.d2 / 2
		} else {
			1d
		}
	}

	def boolean isCylinderCentered(Cylinder cylinder) {
		val isCenter = cylinder.cylinderParams.findLast[center !== null];
		isCenter !== null && 'true'.equals(isCenter.center)
	}

	def dispatch String generate(Intersection intersection) {
		'''
			intersection { 
				«FOR s : intersection.shapes»
					«IF s instanceof Shape»
						«s.impl.generate»
					«ELSEIF s instanceof ModuleOrFunctionCall»
						«(s as ModuleOrFunctionCall).name»()
					«ELSEIF s instanceof TransformedModuleOrFunctionCall»
						«(s as TransformedModuleOrFunctionCall).generate»
					«ENDIF»
				«ENDFOR»	
			}
		'''
	}

	def dispatch String generate(Union union) {
		'''
			merge { 
				«FOR s : union.shapes»
					«IF s instanceof Shape»
						«s.impl.generate»
					«ELSEIF s instanceof ModuleOrFunctionCall»
						«(s as ModuleOrFunctionCall).name»()
					«ELSEIF s instanceof TransformedModuleOrFunctionCall»
						«(s as TransformedModuleOrFunctionCall).generate»
					«ENDIF»
				«ENDFOR»	
			}
		'''
	}

	def dispatch String generate(Difference difference) {
		'''
			difference { 
				«FOR s : difference.shapes»
					«IF s instanceof Shape»
						«s.impl.generate»
					«ELSEIF s instanceof ModuleOrFunctionCall»
						«(s as ModuleOrFunctionCall).name»()
					«ELSEIF s instanceof TransformedModuleOrFunctionCall»
						«(s as TransformedModuleOrFunctionCall).generate»
					«ENDIF»
				«ENDFOR»		
			}
		'''
	}

	def dispatch String generate(TransformedShape transformedShape) {

		'''
			object {
				«FOR s : transformedShape.impl»
					«s.impl.generate»
				«ENDFOR»
				«FOR t : transformedShape.translations.reverseView»
					«t.generate»
				«ENDFOR»
			}
		'''
	}

	def dispatch String generate(TransformedModuleOrFunctionCall transformedModuleOrFunctionCall) {

		'''
			object {
				«FOR s : transformedModuleOrFunctionCall.impl»
					«s.name»()
				«ENDFOR»
				«FOR t : transformedModuleOrFunctionCall.translations.reverseView»
					«t.generate»
				«ENDFOR»
			}
		'''
	}

	def dispatch String generate(Scale scale) {
		'''
			«IF scale.scale!==null»
				scale <«scale.scale»,«scale.scale»,«scale.scale»>
			«ELSE»
				scale <«scale.x»,«scale.y»,«scale.z»>
			«ENDIF»
		'''
	}

	def dispatch String generate(Translate translate) {
		'''
			translate <«translate.x»,«translate.y»,«translate.z»>
		'''
	}

	def dispatch String generate(Rotate rotate) {
		'''
			rotate <«rotate.x»,«rotate.y»,«rotate.z»>
		'''
	}

	protected def fileNameRelativeToProjectName(Resource res) {
		val fileNameWithProjectFolder = res.URI.toPlatformString(true)
		fileNameWithProjectFolder.substring(fileNameWithProjectFolder.indexOf('/', 1),
			fileNameWithProjectFolder.indexOf('.'))
	}

	protected def fileName(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
}
