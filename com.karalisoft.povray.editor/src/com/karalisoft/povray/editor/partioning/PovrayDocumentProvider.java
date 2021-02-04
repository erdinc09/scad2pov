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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class PovrayDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner = new FastPartitioner(new PovrayPartitionScanner(),
					new String[] { PovrayPartitionScanner.POV_COMMENT, PovrayPartitionScanner.POV_INCLUDE,
							PovrayPartitionScanner.POV_DECLARE, PovrayPartitionScanner.POV_VERSION,
							PovrayPartitionScanner.POV_MACRO, PovrayPartitionScanner.POV_END,PovrayPartitionScanner.POV_ELSE,
							PovrayPartitionScanner.POV_DEFINE, PovrayPartitionScanner.POV_WHILE,
							PovrayPartitionScanner.POV_IF, PovrayPartitionScanner.POV_DEBUG,
							PovrayPartitionScanner.POV_LOCAL, PovrayPartitionScanner.POV_DEFAULT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}