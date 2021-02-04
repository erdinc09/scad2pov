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

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class NumberRule implements IRule {
	protected final IToken fToken;

	public NumberRule(IToken token) {
		Assert.isNotNull(token);
		fToken = token;
	}

	@Override
	public IToken evaluate(ICharacterScanner scanner) {
		boolean coloumnStart = scanner.getColumn() == 0;
		int charBefore = -1;
		int readCount = 0;
		if (!coloumnStart) {
			scanner.unread();
			charBefore = scanner.read();
		}

		int c = scanner.read();
		++readCount;
		if (Character.isDigit((char) c)) {

			do {
				c = scanner.read();
				++readCount;
			} while (Character.isDigit((char) c) || c == '.');

			if (coloumnStart || (!Character.isLetter((char) charBefore) && !Character.isDigit((char) charBefore))) {
				scanner.unread();
				return fToken;
			} else {
				while (--readCount >= 0) {
					scanner.unread();
				}
				return Token.UNDEFINED;
			}
		}

		scanner.unread();
		return Token.UNDEFINED;
	}
}
