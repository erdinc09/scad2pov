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
package com.karalisoft.ui.labeling

import com.google.inject.Inject
import com.karalisoft.scad.Cube
import com.karalisoft.scad.Cylinder
import com.karalisoft.scad.Difference
import com.karalisoft.scad.Function
import com.karalisoft.scad.Intersection
import com.karalisoft.scad.Module
import com.karalisoft.scad.ModuleOrFunctionCall
import com.karalisoft.scad.Rotate
import com.karalisoft.scad.Scale
import com.karalisoft.scad.Shape
import com.karalisoft.scad.Sphere
import com.karalisoft.scad.TransformedShape
import com.karalisoft.scad.Translate
import com.karalisoft.scad.Union
import com.karalisoft.scad.UseOrInclude
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.eclipse.xtext.ui.label.StylerFactory
import com.karalisoft.scad.TransformedModuleOrFunctionCall

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class ScadLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	var StylerFactory stylerFactory;

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(Module module) {
		new StyledString('Module', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			module.name, stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Module module) {
		'module.png'
	}

	def text(Rotate rotate) {
		new StyledString('Rotate', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			'''[«rotate.x», «rotate.y», «rotate.z»]''', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Rotate rotate) {
		'rotate.png'
	}

	def text(Translate translate) {
		new StyledString('Translate', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			'''[«translate.x», «translate.y», «translate.z»]''', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Translate translate) {
		'translate.png'
	}

	def text(Scale scale) {
		if (scale.x !== null) {
			new StyledString('Scale', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			'''[«scale.x», «scale.y», «scale.z»]''', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
		} else if (scale.scale !== null) {
			new StyledString('Scale', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			'''scale = «scale.scale»''', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
		}
	}

	def text(UseOrInclude useOrInclude) {
		'use/include'
	}

	def image(UseOrInclude useOrInclude) {
		'useorinclude.png'
	}

	def image(Scale scale) {
		'scale.png'
	}

	def text(Sphere sphere) {
		val List<String> sizeList = new ArrayList
		sizeList.add('1')
		if (sphere.sphereParams !== null) {
			sphere.sphereParams.forEach [ par |
				if (par.r !== null) {
					sizeList.add('''r = «par.r»''')
				}
				if (par.d !== null) {
					sizeList.add('''d = «par.d»''')
				}
			]
		}
		new StyledString('Sphere', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			' (' + sizeList.last + ')', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Sphere sphere) {
		'sphere.png'
	}

	def text(Cube cube) {
		val List<String> sizeList = new ArrayList
		sizeList.add('1')
		if (cube.cubeParams !== null) {
			cube.cubeParams.forEach [ par |
				if (par.size !== null) {
					sizeList.add(par.size.toString)
				}
				if (par.x !== null) {
					sizeList.add('''[«par.x», «par.y», «par.z»]''')
				}
			]
		}
		new StyledString('Cube', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			' (size = ' + sizeList.last + ')', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Cube cube) {
		'cube.png'
	}

	def text(Cylinder cylinder) {
		val List<String> sizeList = new ArrayList
		sizeList.add('h = 1')
		if (cylinder.cylinderParams !== null) {
			cylinder.cylinderParams.forEach [ par |
				if (par.h !== null) {
					sizeList.add('''h = «par.h»''')
				}
			]
		}
		new StyledString('Cylinder', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			' (' + sizeList.last + ')', stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Cylinder cylinder) {
		'cylinder.png'
	}

	def text(Union union) {
		'Union'
	}

	def image(Union union) {
		'union.png'
	}

	def text(Intersection intersection) {
		'Intersection'
	}

	def image(Intersection intersection) {
		'intersection.png'
	}

	def text(Difference difference) {
		'Difference'
	}

	def image(Difference difference) {
		'difference.png'
	}

	def text(TransformedShape shape) {
		'Transformed Shape'
	}

	def text(TransformedModuleOrFunctionCall call) {
		'Transformed Call'
	}

	def image(TransformedShape shape) {
		'transformed_shape.png'
	}

	def image(TransformedModuleOrFunctionCall call) {
		'transformed_call.png'
	}

	def text(Function function) {
		new StyledString('Function', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').append(
			function.name, stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(Function function) {
		'function.png'
	}

	def text(Shape shape) {
		throw new IllegalStateException();
	}

//	def text(ModuleOrFunctionCall moduleOrFunctionCall) {
//		if (moduleOrFunctionCall.name instanceof Module) {
//			return new StyledString('Module Call', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).
//				append(' ').append(moduleOrFunctionCall.name.name,
//					stylerFactory.createXtextStyleAdapterStyler(darkStyle))
//		} else if (moduleOrFunctionCall.name instanceof Function) {
//			return new StyledString('Function Call', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).
//				append(' ').append(moduleOrFunctionCall.name.name,
//					stylerFactory.createXtextStyleAdapterStyler(darkStyle))
//		}
//		''
//	}
//
//	def image(ModuleOrFunctionCall moduleOrFunctionCall) {
//		if (moduleOrFunctionCall.name instanceof Module) {
//			return 'module_call.png'
//		} else if (moduleOrFunctionCall.name instanceof Function) {
//			return 'function_call.png'
//		}
//		'function_call.png'
//	}
	def text(ModuleOrFunctionCall moduleOrFunctionCall) {
		return new StyledString('Module Call', stylerFactory.createXtextStyleAdapterStyler(normalStyle)).append(' ').
			append(moduleOrFunctionCall.name, stylerFactory.createXtextStyleAdapterStyler(darkStyle))
	}

	def image(ModuleOrFunctionCall moduleOrFunctionCall) {
		return 'module_call.png'
	}

	def getNormalStyle() {
		val TextStyle style = new TextStyle
		style.color = new RGB(172, 172, 172)
		style
	}

	def getDarkStyle() {
		val TextStyle style = new TextStyle
		style.color = new RGB(99, 99, 99)
		style
	}

	@Accessors
	static class MutatableObject<T> {
		T data

		new(T data) {
			this.data = data
		}
	}

	@Data
	static class XYZ {
		double x;
		double y;
		double z
	}
}
