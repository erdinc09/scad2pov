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

package com.karalisoft.povray.editor.scanner;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class KeywordRule implements IRule {

	private final Token token;
	private final String keyword;

	public KeywordRule(Token token, String keyword) {
		this.token = token;
		this.keyword = keyword;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {

		boolean coloumnStart = scanner.getColumn() == 0;
		int charBefore = -1;
		if (!coloumnStart) {
			scanner.unread();
			charBefore = scanner.read();
		}

		int idx = 0;
		int readCount = 0;
		int c = -1;
		for (; idx < keyword.length(); ++idx) {
			c = scanner.read();
			++readCount;
			if (c != keyword.charAt(idx) || c == ICharacterScanner.EOF) {
				break;
			}
		}

		c = scanner.read();
		boolean keywordEndsWithLetter = Character.isLetter(c);
		scanner.unread();

		if (!keywordEndsWithLetter && idx == keyword.length()
				&& (coloumnStart || Character.isWhitespace((char) charBefore))) {
			return token;
		}

		while (--readCount >= 0) {
			scanner.unread();
		}
		return Token.UNDEFINED;
	}
}