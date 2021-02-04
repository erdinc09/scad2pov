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

package com.karalisoft.povray.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;

import com.karalisoft.povray.editor.partioning.NonRuleBasedDamagerRepairer;
import com.karalisoft.povray.editor.partioning.PovrayPartitionScanner;
import com.karalisoft.povray.editor.scanner.KeywordRule;
import com.karalisoft.povray.editor.scanner.StringRule;

public class PovrayReconciler extends PresentationReconciler {

	public PovrayReconciler(ColorManager colorManager) {
		TextAttribute commentAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.COMMENT_COLOR), null,
				SWT.BOLD);

		TextAttribute basicShapeAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.BASIC_SHAPE_COLOR),
				null, SWT.BOLD);

		TextAttribute sceneDevicesAttribute = new TextAttribute(
				colorManager.getColor(PovrayConstants.SCENE_DEVICES_COLOR), null, SWT.BOLD);

		TextAttribute numberAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.NUMBER_COLOR), null,
				SWT.NORMAL);

		TextAttribute stringAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.STRING_COLOR), null,
				SWT.NORMAL);

		TextAttribute includeAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.INCLUDE_COLOR), null,
				SWT.NORMAL);

		TextAttribute csgAttribute = new TextAttribute(colorManager.getColor(PovrayConstants.CSG_COLOR), null,
				SWT.NORMAL);

		TextAttribute textureRealtedAttribute = new TextAttribute(
				colorManager.getColor(PovrayConstants.TEXTURE_RELATED_COLOR), null, SWT.NORMAL);

		TextAttribute transformAttribute = new TextAttribute(
				colorManager.getColor(PovrayConstants.TRANSFORM_RELATED_COLOR), null, SWT.NORMAL);

		RuleBasedScanner scanner = new RuleBasedScanner();

		scanner.setRules(new IRule[] {
				new KeywordRule(new Token(basicShapeAttribute), "sphere"),
				new KeywordRule(new Token(basicShapeAttribute), "box"),
				new KeywordRule(new Token(basicShapeAttribute), "UnitBox"),
				new KeywordRule(new Token(basicShapeAttribute), "cone"),
				new KeywordRule(new Token(basicShapeAttribute), "cylinder"),
				new KeywordRule(new Token(basicShapeAttribute), "plane"),
				new KeywordRule(new Token(basicShapeAttribute), "torus"),
				new KeywordRule(new Token(basicShapeAttribute), "object"), new StringRule(new Token(stringAttribute)),

				new KeywordRule(new Token(sceneDevicesAttribute), "camera"),

				new KeywordRule(new Token(sceneDevicesAttribute), "light_source"),
				new KeywordRule(new Token(sceneDevicesAttribute), "background"),
				new KeywordRule(new Token(sceneDevicesAttribute), "global_settings"),

				new KeywordRule(new Token(csgAttribute), "union"),
				new KeywordRule(new Token(csgAttribute), "intersecion"),
				new KeywordRule(new Token(csgAttribute), "merge"),
				new KeywordRule(new Token(csgAttribute), "difference"),

				new KeywordRule(new Token(textureRealtedAttribute), "texture"),
				new KeywordRule(new Token(textureRealtedAttribute), "finish"),
				new KeywordRule(new Token(textureRealtedAttribute), "pigment"),
				new KeywordRule(new Token(textureRealtedAttribute), "normal"),

				// text shouuld be before texture :-)
				new KeywordRule(new Token(basicShapeAttribute), "text"),
				new KeywordRule(new Token(transformAttribute), "translate"),
				new KeywordRule(new Token(transformAttribute), "rotate"),
				new KeywordRule(new Token(transformAttribute), "scale"),
				new KeywordRule(new Token(transformAttribute), "matrix"),

				new com.karalisoft.povray.editor.scanner.NumberRule(new Token(numberAttribute)),

		});

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
		setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndrCommnet = new NonRuleBasedDamagerRepairer(commentAttribute);
		setDamager(ndrCommnet, PovrayPartitionScanner.POV_COMMENT);
		setRepairer(ndrCommnet, PovrayPartitionScanner.POV_COMMENT);

		NonRuleBasedDamagerRepairer ndrNumberSignStatrting = new NonRuleBasedDamagerRepairer(includeAttribute);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_INCLUDE);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_INCLUDE);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DECLARE);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DECLARE);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_VERSION);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_VERSION);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_MACRO);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_MACRO);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_END);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_END);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_ELSE);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_ELSE);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_WHILE);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_WHILE);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEFINE);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEFINE);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEBUG);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEBUG);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_LOCAL);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_LOCAL);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEFAULT);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_DEFAULT);
		setDamager(ndrNumberSignStatrting, PovrayPartitionScanner.POV_IF);
		setRepairer(ndrNumberSignStatrting, PovrayPartitionScanner.POV_IF);
	}
}