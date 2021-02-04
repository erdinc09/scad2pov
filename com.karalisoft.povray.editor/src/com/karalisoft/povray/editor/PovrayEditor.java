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

import java.util.ResourceBundle;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.TextOperationAction;

import com.karalisoft.povray.editor.partioning.PovrayDocumentProvider;

public class PovrayEditor extends TextEditor {

	private ColorManager colorManager;
	private IAction formatAction;

	public PovrayEditor() {
		colorManager = new ColorManager();
		setDocumentProvider(new PovrayDocumentProvider());
		setSourceViewerConfiguration(new PovraySourceViewerConfiguration(colorManager));
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);

		IContextService contextService = getSite().getService(IContextService.class);
		contextService.activateContext("com.karalisoft.povray.editor.povrayEditorScope");
	}


	@Override
	protected void createActions() {
		super.createActions();

		ResourceBundle bundle = ResourceBundle.getBundle("com.karalisoft.povray.editor.PovrayEditorProperties"); //$NON-NLS-1$
		formatAction = new TextOperationAction(bundle, "ContentFormat.", this, ISourceViewer.FORMAT);
		formatAction.setActionDefinitionId("com.karalisoft.povray.editor.format");
		setAction("com.karalisoft.povray.editor.format", formatAction);
	}

	@Override
	protected void editorContextMenuAboutToShow(IMenuManager menu) {
		super.editorContextMenuAboutToShow(menu);
		menu.add(formatAction);
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
}
