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
package com.karalisoft.validation

import com.karalisoft.scad.Cube
import com.karalisoft.scad.Cylinder
import com.karalisoft.scad.ModuleOrFunction
import com.karalisoft.scad.ScadPackage
import com.karalisoft.scad.Sphere
import org.eclipse.xtext.validation.Check


class ScadValidator extends AbstractScadValidator {

	public static val SCAD_CAMERA_MODULE_NAME = "scad_camera";

	public static val SCAD_LIGHT_SOURCES_NAME = "scad_light_source"

	public static val SCAD_BACK_GROUND_NAME = "scad_background";

	public static val SCAD_AXES = "scad_axes";

	@Check
	def checkMethodOrFunctionCall(ModuleOrFunction moduleOrFunction) {
		if (moduleOrFunction.name == SCAD_CAMERA_MODULE_NAME) {
			error(SCAD_CAMERA_MODULE_NAME + ' is reserved name', moduleOrFunction,
				ScadPackage.Literals.MODULE_OR_FUNCTION__NAME)
		}

		if (moduleOrFunction.name == SCAD_LIGHT_SOURCES_NAME) {
			error(SCAD_LIGHT_SOURCES_NAME + ' is reserved name', moduleOrFunction,
				ScadPackage.Literals.MODULE_OR_FUNCTION__NAME)
		}

		if (moduleOrFunction.name == SCAD_BACK_GROUND_NAME) {
			error(SCAD_BACK_GROUND_NAME + ' is reserved name', moduleOrFunction,
				ScadPackage.Literals.MODULE_OR_FUNCTION__NAME)
		}

		if (moduleOrFunction.name == SCAD_AXES) {
			error(SCAD_AXES + ' is reserved name', moduleOrFunction, ScadPackage.Literals.MODULE_OR_FUNCTION__NAME)
		}
	}

	@Check
	def checkCylinderRadiusParams(Cylinder cylinder) {

		val r = cylinder.cylinderParams.findFirst[r !== null]
		val r1 = cylinder.cylinderParams.findFirst[r1 !== null]
		val r2 = cylinder.cylinderParams.findFirst[r2 !== null]
		val d = cylinder.cylinderParams.findFirst[d !== null]
		val d1 = cylinder.cylinderParams.findFirst[d1 !== null]
		val d2 = cylinder.cylinderParams.findFirst[d2 !== null]

		val params = #[
			r -> ScadPackage.Literals.CYLINDER_PARAMS__R,
			r1 -> ScadPackage.Literals.CYLINDER_PARAMS__R1,
			r2 -> ScadPackage.Literals.CYLINDER_PARAMS__R2,
			d -> ScadPackage.Literals.CYLINDER_PARAMS__D,
			d1 -> ScadPackage.Literals.CYLINDER_PARAMS__D1,
			d2 -> ScadPackage.Literals.CYLINDER_PARAMS__D2
		]

		val r_params = #[
			r -> ScadPackage.Literals.CYLINDER_PARAMS__R,
			r1 -> ScadPackage.Literals.CYLINDER_PARAMS__R1,
			r2 -> ScadPackage.Literals.CYLINDER_PARAMS__R2
		]

		val d_params = #[
			d -> ScadPackage.Literals.CYLINDER_PARAMS__D,
			d1 -> ScadPackage.Literals.CYLINDER_PARAMS__D1,
			d2 -> ScadPackage.Literals.CYLINDER_PARAMS__D2
		]

		val isRadiusWay = r !== null || r1 !== null || r2 !== null;
		val isDiameterWay = d !== null || d1 !== null || d2 !== null;

		if (isRadiusWay && isDiameterWay) {
			params.filterNull.forEach [ par |
				error(
					'radius values and diameter values cannot be used simultaneously',
					par.key,
					par.value
				)
			]
			return
		}

		if (r !== null && (r1 !== null || r2 !== null)) {
			r_params.filterNull.forEach [ par |
				error(
					'if r is defined, r1 and r2 cannot be defined',
					par.key,
					par.value
				)
			]
			return
		}

		if (d !== null && (d1 !== null || d2 !== null)) {
			d_params.filterNull.forEach [ par |
				error(
					'if d is defined, d1 and d2 cannot be defined',
					par.key,
					par.value
				)
			]
			return
		}
	}

	@Check
	def checkCylinderRadiusParamDuplicates(Cylinder cylinder) {
		val rIt = cylinder.cylinderParams.filter[r !== null]
		val r1It = cylinder.cylinderParams.filter[r1 !== null]
		val r2It = cylinder.cylinderParams.filter[r2 !== null]

		val dIt = cylinder.cylinderParams.filter[d !== null]
		val d1It = cylinder.cylinderParams.filter[d1 !== null]
		val d2It = cylinder.cylinderParams.filter[d2 !== null]

		if (rIt.size > 1) {
			rIt.forEach [ r |
				warning(
					'multiple r values, last one will override',
					r,
					ScadPackage.Literals.CYLINDER_PARAMS__R
				)
			]
		}

		if (r1It.size > 1) {
			r1It.forEach [ r1 |
				warning(
					'multiple r1 values, last one will override',
					r1,
					ScadPackage.Literals.CYLINDER_PARAMS__R1
				)
			]
		}

		if (r2It.size > 1) {
			r2It.forEach [ r2 |
				warning(
					'multiple r2 values, last one will override',
					r2,
					ScadPackage.Literals.CYLINDER_PARAMS__R2
				)
			]
		}

		if (dIt.size > 1) {
			dIt.forEach [ d |
				warning(
					'multiple d values, last one will override',
					d,
					ScadPackage.Literals.CYLINDER_PARAMS__D
				)
			]
		}

		if (d1It.size > 1) {
			d1It.forEach [ d1 |
				warning(
					'multiple d1 values, last one will override',
					d1,
					ScadPackage.Literals.CYLINDER_PARAMS__D1
				)
			]
		}

		if (d2It.size > 1) {
			d2It.forEach [ d2 |
				warning(
					'multiple d2 values, last one will override',
					d2,
					ScadPackage.Literals.CYLINDER_PARAMS__D2
				)
			]
		}
	}

	@Check
	def checkSpehereRadiusParams(Sphere sphere) {
		val rIt = sphere.sphereParams.filter[r !== null]
		val dIt = sphere.sphereParams.filter[d !== null]

		if (rIt.size != 0 && dIt.size != 0) {
			rIt.forEach [ r |
				error(
					'radius values and diameter values cannot be used simultaneously',
					r,
					ScadPackage.Literals.SPHERE_PARAMS__R
				)
			]

			dIt.forEach [ d |
				error(
					'radius values and diameter values cannot be used simultaneously',
					d,
					ScadPackage.Literals.SPHERE_PARAMS__D
				)
			]
			return
		}

		if (rIt.size > 1) {
			rIt.forEach [ r |
				warning(
					'multiple r values, last one will override',
					r,
					ScadPackage.Literals.SPHERE_PARAMS__R
				)
			]
		}

		if (dIt.size > 1) {
			dIt.forEach [ d |
				warning(
					'multiple d values, last one will override',
					d,
					ScadPackage.Literals.SPHERE_PARAMS__D
				)
			]
		}

	}

	@Check
	def checkCubeParamDuplicates(Cube cube) {
		val centerIt = cube.cubeParams.filter[center !== null]
		val sizeIt = cube.cubeParams.filter[size !== null]
		val sizeX = cube.cubeParams.filter[x !== null]

		if (centerIt.size > 1) {
			centerIt.forEach [ center |
				warning(
					'multiple center values, last one will override',
					center,
					ScadPackage.Literals.CUBE_PARAMS__CENTER
				)
			]
		}

		if (sizeIt.size > 1) {
			sizeIt.forEach [ size |
				warning(
					'multiple size values, last one will override',
					size,
					ScadPackage.Literals.CUBE_PARAMS__SIZE
				)
			]
		}

		if (sizeX.size > 1) {
			sizeX.forEach [ x |
				warning(
					'multiple size values, last one will override',
					x,
					null
				)
			]
		}

		if (sizeIt.size >= 1 && sizeX.size >= 1) {
			sizeX.forEach [ x |
				warning(
					'multiple size values, last one will override',
					x,
					ScadPackage.Literals.CUBE_PARAMS__SIZE
				)
			]

			sizeIt.forEach [ size |
				warning(
					'multiple size values, last one will override',
					size,
					ScadPackage.Literals.CUBE_PARAMS__X
				)
			]
		}

	}
}
