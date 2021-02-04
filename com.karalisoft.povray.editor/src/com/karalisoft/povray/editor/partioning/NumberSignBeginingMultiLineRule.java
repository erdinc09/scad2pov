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

package com.karalisoft.povray.editor.partioning;

import org.eclipse.jface.text.rules.*;

public class NumberSignBeginingMultiLineRule extends MultiLineRule {

	public NumberSignBeginingMultiLineRule(IToken token, String endSequence) {
		super("#", endSequence, token);
	}

	@Override
	protected boolean sequenceDetected(ICharacterScanner scanner, char[] sequence, boolean eofAllowed) {

		if (sequence == fStartSequence) {
			int c = scanner.read();
			int readCount = 1;
			while (Character.isWhitespace(c)) {
				c = scanner.read();
				readCount++;
			}

			int idx = 0;
			do {
				if (c != fEndSequence[idx]) {
					while (readCount-- > 0) {
						scanner.unread();
					}
					return false;
				}
				c = scanner.read();
				readCount++;
				idx++;
			} while (idx < fEndSequence.length);

			boolean keywordEndsWithLetter = Character.isLetter(c);

			if (keywordEndsWithLetter) {
				while (readCount-- > 0) {
					scanner.unread();
				}

				return false;
			}

			while (idx-- >= 0) {
				scanner.unread();
			}

			return true;

		} else {
			return super.sequenceDetected(scanner, sequence, eofAllowed);
		}
	}
}
