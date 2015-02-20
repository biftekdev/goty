package com.biftektech.gwt.goty.shared;

import com.biftektech.gwt.goty.shared.enm.NotificationType;
import com.google.gwt.core.client.JavaScriptObject;

public class Goty extends JavaScriptObject {

	/**
	 * 
	 */
	protected Goty() {
	}

	/**
	 * 
	 * @return goty properties of the object
	 */
	public final native GotyProperties getProperties()
	/*-{
		return this.options;
	}-*/;

	/**
	 * Closes notification
	 */
	public final native void close() 
	/*-{
		this.close();
	}-*/;

	/**
	 * Creates new Goty and show.
	 * 
	 * @param gotyObjectProperties
	 * @return initialized Goty object
	 */
	public static final native Goty show(GotyProperties gotyObjectProperties)
	/*-{
		return $wnd.noty(gotyObjectProperties);
	}-*/;

	/**
	 * 
	 * @return predefined default properties
	 */
	public static final native GotyProperties getPredefinedProperties()
	/*-{
		return {
		    layout: 'top',
		    theme: 'defaultTheme', // or 'relax'
		    type: 'alert',
		    text: '', // can be html or string
		    dismissQueue: true, // If you want to use queue feature set this true
		    template: '<div class="noty_message"><span class="noty_text"></span><div class="noty_close"></div></div>',
		    animation: {
		        open: {height: 'toggle'}, // or Animate.css class names like: 'animated bounceInLeft'
		        close: {height: 'toggle'}, // or Animate.css class names like: 'animated bounceOutLeft'
		        easing: 'swing',
		        speed: 500 // opening & closing animation speed
		    },
		    timeout: false, // delay for closing event. Set false for sticky notifications
		    force: false, // adds notification to the beginning of queue when set to true
		    modal: false,
		    maxVisible: 5, // you can set max visible notification for dismissQueue true option,
		    killer: false, // for close all notifications before show
		    closeWith: ['click'], // ['click', 'button', 'hover', 'backdrop'] // backdrop click will close all notifications
		    callback: {
		        onShow: function() {},
		        afterShow: function() {},
		        onClose: function() {},
		        afterClose: function() {},
		        onCloseClick: function() {},
		    },
		    closable: true,
		    buttons: [] // an array of buttons
		};
	}-*/;

	/**
	 * 
	 * @return default properties
	 */
	public static final native GotyProperties getDefaultProperties()
	/*-{
		return $wnd.$.noty.defaults;
	}-*/;

	public static final native void setDefaultProperties(GotyProperties gotyProperties)
	/*-{
		$wnd.$.noty.defaults = gotyProperties;
	}-*/;
	
	public static final native Goty get(String id) /*-{
		return $wnd.$.noty.get(id);
	}-*/;
	public static final native void close(String id) /*-{
		$wnd.$.noty.close(id);
	}-*/;
	public static final native void clearQueue() /*-{
		$wnd.$.noty.clearQueue();
	}-*/;
	public static final native void closeAll() /*-{
		$wnd.$.noty.closeAll();
	}-*/;
	public static final native void setText(String id, String text) /*-{
		$wnd.$.noty.setText(id, text);
	}-*/;
	public static final native void setText(String id, NotificationType type) /*-{
		$wnd.$.noty.setText(id, type.@com.biftektech.gwt.goty.shared.enm.NotificationType::type);
	}-*/;
}
