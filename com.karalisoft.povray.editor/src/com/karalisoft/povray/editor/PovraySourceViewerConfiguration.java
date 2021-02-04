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
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.formatter.MultiPassContentFormatter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

import com.karalisoft.povray.editor.formatter.NumberSignBeginingMultiLineRuleFormatter;
import com.karalisoft.povray.editor.formatter.PovrayFormatter;
import com.karalisoft.povray.editor.partioning.PovrayPartitionScanner;

public class PovraySourceViewerConfiguration extends TextSourceViewerConfiguration {

	private final ColorManager colorManager;

	public PovraySourceViewerConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;

	}

	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		return new PovrayReconciler(colorManager);
	}

	@Override
	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		MultiPassContentFormatter formatter = new MultiPassContentFormatter(
				getConfiguredDocumentPartitioning(sourceViewer), IDocument.DEFAULT_CONTENT_TYPE);
		formatter.setMasterStrategy(new PovrayFormatter());
		NumberSignBeginingMultiLineRuleFormatter whiteSpaceNumberSignBeginingMultiLineRuleFormatter = new NumberSignBeginingMultiLineRuleFormatter();
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_DECLARE);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_DEBUG);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_DEBUG);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_DEFAULT);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_DEFINE);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter, PovrayPartitionScanner.POV_END);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_INCLUDE);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_LOCAL);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_MACRO);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_VERSION);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter,
				PovrayPartitionScanner.POV_WHILE);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter, PovrayPartitionScanner.POV_IF);
		formatter.setSlaveStrategy(whiteSpaceNumberSignBeginingMultiLineRuleFormatter, PovrayPartitionScanner.POV_ELSE);

		return formatter;
	}
}
