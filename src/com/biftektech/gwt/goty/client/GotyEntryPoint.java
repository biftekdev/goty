package com.biftektech.gwt.goty.client;

/*
 * #%L
 * Goty
 * %%
 * Copyright (C) 2015 Goty
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.biftektech.gwt.goty.shared.util.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.user.client.Window;

/**
 * @author Biftek Technology
 * 
 */
public class GotyEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		if (!isjQueryLoaded()) {
			Log.i("Injecting jQuery...");
			
			ScriptInjector
					.fromString(GotyClientBundle.INSTANCE.jQuery().getText())
					.setWindow(ScriptInjector.TOP_WINDOW).inject();
		} else {
			Log.i("jQuery has been already injected...");
		}
		Log.i("Injecting noty...");
		ScriptInjector.fromString(GotyClientBundle.INSTANCE.noty().getText())
				.setWindow(ScriptInjector.TOP_WINDOW).inject();
		if (!isNotyLoaded()) {
			Window.alert("noty loaded.");
		}
	}

	/**
	 * Check to see if jQuery is loaded already
	 * 
	 * @return true is jQuery is loaded, false otherwise
	 */
	private native boolean isjQueryLoaded()
	/*-{
		return (typeof $wnd['jQuery'] !== 'undefined');
	}-*/;
	
	/**
	 * Check to see if noty is loaded already
	 * 
	 * @return true is noty is loaded, false otherwise
	 */
	private native boolean isNotyLoaded()
	/*-{
		return (typeof $wnd['noty'] !== 'undefined');
	}-*/;
}
