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
package com.biftektech.gwt.goty.shared;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;

/**
 * @author Biftek Technology
 * 
 *         This class is used to animate notfication using jQuery.animate
 */
public class JqueryAnimation extends Animation {

	/**
	 * 
	 */
	protected JqueryAnimation() {
	}

	/**
	 * @return jQuery.animate proeprties for opening animation
	 */
	public final JSONObject getOpen() {
		return new JSONObject(getNativeOpen());
	}

	public final native JavaScriptObject getNativeOpen()
	/*-{
		return this.open;
	}-*/;

	/**
	 * Sets jQuery.animate properties for opening animation
	 * 
	 * @param open
	 */
	public final native void setOpen(JSONObject open)
	/*-{
		this.open = open.@com.google.gwt.json.client.JSONObject::getJavaScriptObject()();
	}-*/;

	/**
	 * @return jQuery.animate proeprties for closing animation
	 */
	public final JSONObject getClose() {
		return new JSONObject(getNativeClose());
	}

	public final native JavaScriptObject getNativeClose()
	/*-{
		return this.close;
	}-*/;

	/**
	 * Sets jQuery.animate properties for closing animation
	 * 
	 * @param open
	 */
	public final native void setClose(JSONObject close)
	/*-{
		this.close = close.@com.google.gwt.json.client.JSONObject::getJavaScriptObject()();
	}-*/;

}
