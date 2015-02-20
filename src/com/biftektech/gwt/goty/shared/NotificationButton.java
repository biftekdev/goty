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

import com.biftektech.gwt.goty.shared.enm.ButtonType;
import com.biftektech.gwt.goty.shared.event.NotificationCallback;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Biftek Technology
 * 
 *         This button is not a standard GWT button. Just holds some properties
 *         and provides them to noty to display button in notifications
 */
public class NotificationButton extends JavaScriptObject {

	// private String addClass;
	// private String text;

	/**
	 * 
	 */
	protected NotificationButton() {
	}

	/**
	 * 
	 * @return empty initialized object
	 */
	public static final native NotificationButton create()
	/*-{
		return {};
	}-*/;

	/**
	 * 
	 * @param buttonType
	 * @param text
	 * @param onClick
	 * @return object initialized using parameters
	 */
	public static final NotificationButton create(ButtonType buttonType,
			String text, NotificationCallback onClick) {
		NotificationButton button = NotificationButton.create();
		button.setButtonType(buttonType);
		button.setText(text);
		button.setOnClick(onClick);
		return button;
	}

	/**
	 * 
	 * @param addClass
	 * @param text
	 * @param onClick
	 * @return object initialized using parameters
	 */
	public static final NotificationButton create(String addClass, String text,
			NotificationCallback onClick) {
		NotificationButton button = NotificationButton.create();
		button.setAddClass(addClass);
		button.setText(text);
		button.setOnClick(onClick);
		return button;
	}

	/**
	 * 
	 * @return button class names
	 */
	public final native String getAddClass()
	/*-{
		return this.addClass;
	}-*/;

	/**
	 * Sets class names for button. As default, bootstrap button class names can
	 * be used. Custom button class names can be used too.
	 * 
	 * @param addClass
	 */
	public final native void setAddClass(String addClass)
	/*-{
		this.addClass = addClass;
	}-*/;

	/**
	 * 
	 * @return button text
	 */
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	/**
	 * Sets button text
	 * 
	 * @param text
	 */
	public final native void setText(String text)
	/*-{
		this.text = text;
	}-*/;

	/**
	 * Sets click handler to be fired when related button is clicked
	 * 
	 * @param onClick
	 */
	public final native void setOnClick(NotificationCallback onClick)
	/*-{
		this.onClick = function($noty) {
			onClick.@com.biftektech.gwt.goty.shared.event.NotificationCallback::call(Lcom/biftektech/gwt/goty/shared/Goty;)($noty);
		};
	}-*/;

	/**
	 * Sets addClass by predefined button types
	 * 
	 * @param buttonType
	 */
	public final void setButtonType(ButtonType buttonType) {
		this.setAddClass(buttonType.type);
	}

}
