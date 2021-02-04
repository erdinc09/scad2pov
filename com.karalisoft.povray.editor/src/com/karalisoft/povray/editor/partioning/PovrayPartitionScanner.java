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

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class PovrayPartitionScanner extends RuleBasedPartitionScanner {
	public static final String POV_COMMENT = "__povray_comment";
	public static final String POV_INCLUDE = "__povray_include";
	public static final String POV_DECLARE = "__povray_declare";
	public static final String POV_VERSION = "__povray_version";
	public static final String POV_MACRO = "__povray_macro";
	public static final String POV_END = "__povray_end";
	public static final String POV_ELSE = "__povray_else";
	public static final String POV_WHILE = "__povray_while";
	public static final String POV_IF = "__povray_if";
	public static final String POV_DEFINE = "__povray_define";

	public static final String POV_DEBUG = "__povray_debug";
	public static final String POV_LOCAL = "__povray_local";
	public static final String POV_DEFAULT = "__povray_default";

	public PovrayPartitionScanner() {

		IPredicateRule[] rules = new IPredicateRule[] { new MultiLineRule("/*", "*/", new Token(POV_COMMENT)),
				new EndOfLineRule("//", new Token(POV_COMMENT)),
				new IncludeRule(new Token(POV_INCLUDE)), new DeclareRule(new Token(POV_DECLARE)),
				new VersionRule(new Token(POV_VERSION)), new MacroRule(new Token(POV_MACRO)),
				new EndRule(new Token(POV_END)),new ElseRule(new Token(POV_ELSE)), new WhileRule(new Token(POV_WHILE)), new IfRule(new Token(POV_IF)),
				new DefineRule(new Token(POV_DEFINE)), new DebugRule(new Token(POV_DEBUG)),
				new LocalRule(new Token(POV_LOCAL)), new DefaultRule(new Token(POV_DEFAULT)) };

		setPredicateRules(rules);
	}
}
