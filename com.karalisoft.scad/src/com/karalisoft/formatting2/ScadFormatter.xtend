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
package com.karalisoft.formatting2

import com.karalisoft.scad.Cube
import com.karalisoft.scad.Difference
import com.karalisoft.scad.Intersection
import com.karalisoft.scad.Model
import com.karalisoft.scad.Module
import com.karalisoft.scad.Rotate
import com.karalisoft.scad.Scale
import com.karalisoft.scad.Shape
import com.karalisoft.scad.Sphere
import com.karalisoft.scad.TransformedShape
import com.karalisoft.scad.Translate
import com.karalisoft.scad.Union
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import com.karalisoft.scad.UseOrInclude
import com.karalisoft.scad.TransformedModuleOrFunctionCall

class ScadFormatter extends AbstractFormatter2 {

//	@Inject extension ScadGrammarAccess grammar
	def dispatch void format(Model model, extension IFormattableDocument document) {
		for (eObject : model.blocks) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Module module, extension IFormattableDocument document) {
		val open = module.regionFor.keyword("{")
		val close = module.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		for (eObject : module.blocks) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Shape shape, extension IFormattableDocument document) {
		val open = shape.regionFor.keyword("{")
		val close = shape.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		if (open !== null && close !== null) {
			shape.impl.append[setNewLines(1, 1, 2)]
		}

		shape.impl.format
	}

	def dispatch void format(Cube cube, extension IFormattableDocument document) {
		cube.regionFor.keyword("cube").append[noSpace]
		cube.regionFor.keyword("(").append[noSpace].prepend[noSpace]
		cube.regionFor.keyword(")").append[noSpace].prepend[noSpace]
		cube.regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
		cube.cubeParams.forEach [
			regionFor.keyword('=').append[oneSpace].prepend[oneSpace]
			regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
		]
	}

	def dispatch void format(Sphere sphere, extension IFormattableDocument document) {
		sphere.regionFor.keyword("sphere").append[noSpace]
		sphere.regionFor.keyword("(").append[noSpace]
		sphere.regionFor.keyword(")").append[noSpace].prepend[noSpace]
		sphere.regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
		sphere.sphereParams.forEach [
			regionFor.keyword('=').append[oneSpace].prepend[oneSpace]
		]
	}

	def dispatch void format(TransformedShape transformedShape, extension IFormattableDocument document) {
		val open = transformedShape.regionFor.keyword("{")
		val close = transformedShape.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		if (open !== null && close !== null) {
			for (eObject : transformedShape.impl) {
				eObject.format
				eObject.append[space = "   "]
				eObject.append[setNewLines(1, 1, 2)]
			}
		}
		transformedShape.impl.format

		for (eObject : transformedShape.translations) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}
	
	def dispatch void format(TransformedModuleOrFunctionCall transformedModuleOrFunctionCall, extension IFormattableDocument document) {
		val open = transformedModuleOrFunctionCall.regionFor.keyword("{")
		val close = transformedModuleOrFunctionCall.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		if (open !== null && close !== null) {
			for (eObject : transformedModuleOrFunctionCall.impl) {
				eObject.format
				eObject.append[space = "   "]
				eObject.append[setNewLines(1, 1, 2)]
			}
		}
		transformedModuleOrFunctionCall.impl.format

		for (eObject : transformedModuleOrFunctionCall.translations) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Union union, extension IFormattableDocument document) {

		val open = union.regionFor.keyword("{")
		val close = union.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		for (eObject : union.shapes) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Intersection intersection, extension IFormattableDocument document) {

		val open = intersection.regionFor.keyword("{")
		val close = intersection.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		for (eObject : intersection.shapes) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Difference difference, extension IFormattableDocument document) {
		val open = difference.regionFor.keyword("{")
		val close = difference.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]

		for (eObject : difference.shapes) {
			eObject.format
			eObject.append[setNewLines(1, 1, 2)]
		}
	}

	def dispatch void format(Translate translate, extension IFormattableDocument document) {
		translate.regionFor.keyword('(').append[noSpace].prepend[noSpace]
		translate.regionFor.keyword(')').append[noSpace].prepend[noSpace]
		translate.regionFor.keyword('[').append[noSpace].prepend[noSpace]
		translate.regionFor.keyword(']').append[noSpace].prepend[noSpace]
		translate.regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
	}

	def dispatch void format(Scale scale, extension IFormattableDocument document) {
		scale.regionFor.keyword('(').append[noSpace].prepend[noSpace]
		scale.regionFor.keyword(')').append[noSpace].prepend[noSpace]
		scale.regionFor.keyword('[').append[noSpace].prepend[noSpace]
		scale.regionFor.keyword(']').append[noSpace].prepend[noSpace]
		scale.regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
	}

	def dispatch void format(Rotate rotate, extension IFormattableDocument document) {
		rotate.regionFor.keyword('(').append[noSpace].prepend[noSpace]
		rotate.regionFor.keyword(')').append[noSpace].prepend[noSpace]
		rotate.regionFor.keyword('[').append[noSpace].prepend[noSpace]
		rotate.regionFor.keyword(']').append[noSpace].prepend[noSpace]
		rotate.regionFor.keywords(",").forEach[append[oneSpace].prepend[noSpace]]
	}

	def dispatch void format(UseOrInclude useOrInclude, extension IFormattableDocument document) {
		useOrInclude.regionFor.keyword('use').append[oneSpace].prepend[noSpace]
		useOrInclude.regionFor.keyword('include').append[oneSpace].prepend[noSpace]
		useOrInclude.regionFor.keyword('<').append[noSpace]
		useOrInclude.regionFor.keyword('>').append[noSpace]
	}
}
