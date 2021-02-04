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
package com.karalisoft.ui.contentassist

import com.karalisoft.scad.Model
import com.karalisoft.scad.Module
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ScadProposalProvider extends AbstractScadProposalProvider {

	override complete_ModuleOrFunctionCall(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val moduleCallNameStart = context.document.get(context.replaceRegion.offset, context.replaceRegion.length)

		(model as Model).blocks.filter(Module).filter [ m |
			(m as Module).name.startsWith(moduleCallNameStart)
		].forEach[m|acceptor.accept(createCompletionProposal(m.name + "();", context))]
	}

}
