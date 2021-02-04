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
package com.karalisoft.povray;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class PovrayPlugin extends AbstractUIPlugin {

	private static PovrayPlugin INSTANCE;
	public static final String PLUGIN_ID = "com.karalisoft.povray.editor";

	public PovrayPlugin() {
		INSTANCE = this;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);

	}

	public static void logError(Throwable e) {
		INSTANCE.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, INTERNAL_ERROR, "internal error", e));
	}

	public static final int INTERNAL_ERROR = 1;
}
