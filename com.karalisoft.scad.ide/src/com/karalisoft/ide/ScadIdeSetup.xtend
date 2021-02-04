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
package com.karalisoft.ide

import com.google.inject.Guice
import com.karalisoft.ScadRuntimeModule
import com.karalisoft.ScadStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ScadIdeSetup extends ScadStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ScadRuntimeModule, new ScadIdeModule))
	}
	
}
