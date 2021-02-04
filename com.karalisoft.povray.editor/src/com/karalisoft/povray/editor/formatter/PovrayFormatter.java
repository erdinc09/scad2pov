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

import java.util.Scanner;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.formatter.FormattingContextProperties;
import org.eclipse.jface.text.formatter.IFormattingContext;
import org.eclipse.jface.text.formatter.IFormattingStrategy;
import org.eclipse.jface.text.formatter.IFormattingStrategyExtension;

import com.karalisoft.povray.PovrayPlugin;

public class PovrayFormatter implements IFormattingStrategy, IFormattingStrategyExtension {

	private int currentIndentationLevel = 0;
	private int ifWhileIndentationLevel = 0;

	@Override
	public void format() {
	}

	@Override
	public void formatterStarts(IFormattingContext context) {
		IDocument doc = (IDocument) context.getProperty(FormattingContextProperties.CONTEXT_MEDIUM);

		try (Scanner scanner = new Scanner(doc.get());) {
			StringBuilder formattedText = new StringBuilder();
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				String trimmedNextLine = nextLine.trim();
				if (nextLine.startsWith("//")) {
					addLine(formattedText, nextLine, false);
				} else if (trimmedNextLine.endsWith("{")) {
					if (trimmedNextLine.equals("{")) {
						trimmedNextLine = trimmedNextLine.replaceAll("\\s*\\{\\s*", "{ ");
					} else {
						trimmedNextLine = trimmedNextLine.replaceAll("\\s*\\{\\s*", " { ");
					}
					currentIndentationLevel++;
					addLine(formattedText, trimmedNextLine, true);
				} else if (trimmedNextLine.startsWith("}")) {
					addLine(formattedText, trimmedNextLine, true);
					currentIndentationLevel--;
				} else if (trimmedNextLine.startsWith("#if") || trimmedNextLine.startsWith("#while")
						|| trimmedNextLine.startsWith("#macro") ) {
					addLine(formattedText, trimmedNextLine, false);
					ifWhileIndentationLevel++;
				}
				else if (trimmedNextLine.startsWith("#else") ) {
					addLine(formattedText, trimmedNextLine, true);
				}
				else if (trimmedNextLine.startsWith("#end") ) {
					addLine(formattedText, trimmedNextLine, true);
					ifWhileIndentationLevel--;
				} else {
					trimmedNextLine = trimmedNextLine.replaceAll("\\s*\\{\\s*", " { ");
					trimmedNextLine = trimmedNextLine.replaceAll("\\s*\\}\\s*", " } ");
					addLine(formattedText, trimmedNextLine, false);
				}

			}
			doc.set(formattedText.toString());

		} catch (Exception e) {
			PovrayPlugin.logError(e);
		} finally {
			currentIndentationLevel = 0;
			ifWhileIndentationLevel = 0;
		}

	}

	private void addLine(StringBuilder sb, String line, boolean isIndentationMarkerLine) {

		int indentationLevel = currentIndentationLevel;
		if (isIndentationMarkerLine) {
			indentationLevel--;
		}
		indentationLevel = indentationLevel + ifWhileIndentationLevel;

		String indentation = indentationLevel == 0 ? "" : String.format("%" + indentationLevel * 4 + "s", " ");
		sb.append(indentation).append(line).append(System.getProperty("line.separator"));
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
