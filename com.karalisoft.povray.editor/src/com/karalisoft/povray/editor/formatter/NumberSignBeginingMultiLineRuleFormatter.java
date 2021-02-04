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

package com.karalisoft.povray.editor.formatter;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TypedPosition;
import org.eclipse.jface.text.formatter.FormattingContextProperties;
import org.eclipse.jface.text.formatter.IFormattingContext;
import org.eclipse.jface.text.formatter.IFormattingStrategy;
import org.eclipse.jface.text.formatter.IFormattingStrategyExtension;

import com.karalisoft.povray.PovrayPlugin;

public class NumberSignBeginingMultiLineRuleFormatter
		implements IFormattingStrategy, IFormattingStrategyExtension {

	@Override
	public void format() {
	}

	@Override
	public void formatterStarts(IFormattingContext context) {
		IDocument doc = (IDocument) context.getProperty(FormattingContextProperties.CONTEXT_MEDIUM);
		TypedPosition pos = (TypedPosition) context.getProperty(FormattingContextProperties.CONTEXT_PARTITION);
		try {
			String declareText = doc.get(pos.offset, pos.length);
			doc.replace(pos.offset, pos.length, declareText.replaceAll("\\s", ""));
		} catch (BadLocationException e) {
			PovrayPlugin.logError(e);
		}

	}

	@Override
	public void formatterStarts(String initialIndentation) {
	}

	@Override
	public String format(String content, boolean isLineStart, String indentation, int[] positions) {
		return null;
	}

	@Override
	public void formatterStops() {
	}

}
