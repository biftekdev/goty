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

import com.biftektech.gwt.goty.shared.enm.AnimateCss;


/**
 * @author Biftek Technology
 * 
 *         This class is used to animate notfication using animate.css
 */
public class AnimateAnimation extends Animation {

	/**
	 * 
	 */
	protected AnimateAnimation() {
	}
	/**
	 * @return this.animate.css style names for opening animation
	 */
	public final AnimateCss getOpen() {
		return AnimateCss.valueOf(this.getNativeOpen());
	}
	private final native String getNativeOpen() 
	/*-{
		return this.open;
	}-*/;

	/**
	 * Sets animate.css style names for opening animation
	 * 
	 * @param open
	 */
	public final native void setOpen(AnimateCss open) 
	/*-{
		this.open = open.@com.biftektech.gwt.goty.shared.enm.AnimateCss::type;
	}-*/;

	/**
	 * @return this.animate.css style names for close animation
	 */
	public final AnimateCss getClose() {
		return AnimateCss.valueOf(this.getNativeClose());
	}
	private final native String getNativeClose() 
	/*-{
		return this.close;
	}-*/;

	/**
	 * Sets animate.css style names for close animation
	 * 
	 * @param open
	 */
	public final native void setClose(AnimateCss close) 
	/*-{
		this.close = close.@com.biftektech.gwt.goty.shared.enm.AnimateCss::type;
	}-*/;

}
