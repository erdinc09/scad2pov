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

public class StringRule implements IRule {

	private final Token token;

	public StringRule(Token token) {
		this.token = token;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		int readCount = 0;

		int c = scanner.read();
		readCount++;
		if (c == '"') {
			c = scanner.read();
			readCount++;
			while (c != ICharacterScanner.EOF) {
				if ('\n' == c || '\r' == c) {
					while (--readCount >= 0) {
						scanner.unread();
					}
					return Token.UNDEFINED;
				} else if (c == '"') {
					return token;
				}
				c = scanner.read();
				readCount++;
			}
			return token;
		}
		scanner.unread();

		return Token.UNDEFINED;
	}
}