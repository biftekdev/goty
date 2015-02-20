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

import java.util.Locale;

import com.biftektech.gwt.goty.shared.enm.Easing;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Biftek Technology
 * 
 *         This class is used to animate notfication using animate.css
 */
public class Animation extends JavaScriptObject {

//	private Easing	easing;
//	private int		speed;

	/**
	 * 
	 */
	protected Animation() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * An easing function specifies the speed at which the animation progresses
	 * at different points within the animation. Noty uses jQuery easing
	 * implementations.
	 * Easing examples can be seen at <a
	 * href="http://easings.net/">easings.net</a>
	 * 
	 * @return easing
	 */
	public final Easing getEasing() {
		return Easing.valueOf(getNativeEasing().toUpperCase(Locale.ENGLISH));
	}
	private final native String getNativeEasing() /*-{
		return this.easing;
	}-*/;

	/**
	 * Sets easing funtion. An easing function specifies the speed at which the
	 * animation progresses at different points within the animation. Default is
	 * SWING. noty uses jQuery easing implementations. Easing examples can be
	 * seen at <a href="http://easings.net/">easings.net</a>
	 * 
	 * @param easing
	 */
	public final native void setEasing(Easing easing) /*-{
		this.easing = close.@com.biftektech.gwt.goty.shared.enm.Easing::type;
	}-*/;

	/**
	 * 
	 * @return animation speed
	 */
	public final native int getSpeed() /*-{
		return this.speed;
	}-*/;

	/**
	 * Sets animation speed.
	 * 
	 * @param speed
	 */
	public final native void setSpeed(int speed) /*-{
		this.speed = speed;
	}-*/;
}
