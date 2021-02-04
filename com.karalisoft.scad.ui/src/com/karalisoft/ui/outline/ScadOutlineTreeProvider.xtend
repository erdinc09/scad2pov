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
package com.karalisoft.ui.outline

import com.karalisoft.scad.Cube
import com.karalisoft.scad.Cylinder
import com.karalisoft.scad.Difference
import com.karalisoft.scad.Intersection
import com.karalisoft.scad.Shape
import com.karalisoft.scad.Sphere
import com.karalisoft.scad.TransformedShape
import com.karalisoft.scad.Union
import org.eclipse.emf.ecore.EObject
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode
import com.karalisoft.scad.Model
import com.karalisoft.scad.ModuleOrFunctionCall
import com.karalisoft.scad.TransformedModuleOrFunctionCall
import com.karalisoft.scad.impl.TransformedModuleOrFunctionCallImpl

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class ScadOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _isLeaf(Cube cube) {
		true
	}

	def _isLeaf(Sphere sphere) {
		true
	}

	def _isLeaf(Cylinder cylinder) {
		true
	}

	def void _createChildren(IOutlineNode outlineNode, Union union) {
		union.shapes.forEach [ shape |
			if (shape instanceof Shape) {
				createNode(outlineNode, shape.impl)
			} else if (shape instanceof ModuleOrFunctionCall || shape instanceof TransformedModuleOrFunctionCall) {
				createNode(outlineNode, shape)
			}

		]
	}

	def void _createChildren(IOutlineNode outlineNode, Intersection intersection) {
		intersection.shapes.forEach [ shape |
			if (shape instanceof Shape) {
				createNode(outlineNode, shape.impl)
			} else if (shape instanceof ModuleOrFunctionCall || shape instanceof TransformedModuleOrFunctionCall) {
				createNode(outlineNode, shape)
			}
		]
	}

	def void _createChildren(IOutlineNode outlineNode, Difference difference) {
		difference.shapes.forEach [ shape |
			if (shape instanceof Shape) {
				createNode(outlineNode, shape.impl)
			} else if (shape instanceof ModuleOrFunctionCall || shape instanceof TransformedModuleOrFunctionCall) {
				createNode(outlineNode, shape)
			}
		]
	}

	def _createNode(DocumentRootNode outlineNode, Shape shape) {
		createNode(outlineNode, shape.impl);
	}

	def _createNode(IOutlineNode outlineNode, Shape shape) {
		createNode(outlineNode, shape.impl);
	}

	def void _createChildren(IOutlineNode outlineNode, TransformedShape transformedShape) {

		transformedShape.translations.forEach [ transform |
			createNode(outlineNode, transform);
		]
		transformedShape.impl.forEach [ shape |
			createNode(outlineNode, shape.impl);
		]
	}

	def void _createChildren(IOutlineNode outlineNode, TransformedModuleOrFunctionCall tc) {

		tc.translations.forEach [ transform |
			createNode(outlineNode, transform);
		]
		tc.impl.forEach [ mfc |
			createNode(outlineNode, mfc);
		]
	}

	def void _createChildren(DocumentRootNode outlineNode, Model model) {
		model.blocks.forEach [ block |
			createNode(outlineNode, block);
		]
	}

	override protected createEObjectNode(IOutlineNode parentNode, EObject modelElement, Image image, Object text,
		boolean isLeaf) {
		val EObjectNode eObjectNode = new EObjectNode(modelElement, parentNode, image, text, isLeaf);
		val ICompositeNode parserNode = NodeModelUtils.getNode(modelElement);
		if (parserNode !== null)
			eObjectNode.setTextRegion(parserNode.getTextRegion());
		if (isLocalElement(parentNode, modelElement))
			eObjectNode.setShortTextRegion(locationInFileProvider.getFullTextRegion(modelElement));
		return eObjectNode;
	}
}
