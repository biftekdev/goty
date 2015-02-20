package com.biftektech.gwt.goty.shared;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import com.biftektech.gwt.goty.shared.enm.AnimateCss;
import com.biftektech.gwt.goty.shared.enm.CloseWith;
import com.biftektech.gwt.goty.shared.enm.Easing;
import com.biftektech.gwt.goty.shared.enm.NotificationLayout;
import com.biftektech.gwt.goty.shared.enm.NotificationTheme;
import com.biftektech.gwt.goty.shared.enm.NotificationType;
import com.biftektech.gwt.goty.shared.event.NotificationCallback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.user.client.ui.HTML;

public class GotyProperties extends JavaScriptObject {

	// private String text;
	// private Animation animation;
	// private NotificationType type;
	// private boolean dismissQueue;
	// private String template;
	// private double timeout;
	// private boolean force;
	// private boolean modal;
	// private int maxVisible;
	// private boolean killer;
	// private CloseWith closeWith;
	// private List<NotificationButton> buttons;
	// private NotificationCallback onShow;
	// private NotificationCallback afterShow;
	// private NotificationCallback onClose;
	// private NotificationCallback afterClose;
	// private NotificationCallback onCloseClick;

	/**
	 * Initialize an object to modify noty properties
	 */
	protected GotyProperties() {
	}

	/**
	 * Initialize an object to modify noty properties
	 */
	public static final native GotyProperties create()
	/*-{
		return {
		};
	}-*/;

	/**
	 * 
	 * @return auto generated id
	 */
	public final native String getId()
	/*-{
		return this.id;
	}-*/;

	/**
	 * Sets notification theme
	 * 
	 * @param layout
	 */
	public final native void setTheme(NotificationTheme theme)
	/*-{
		this.theme = theme.@com.biftektech.gwt.goty.shared.enm.NotificationTheme::type;
	}-*/;

	/**
	 * Sets notification layout, position
	 * 
	 * @param layout
	 */
	public final native void setLayout(NotificationLayout layout)
	/*-{
		this.layout = layout.@com.biftektech.gwt.goty.shared.enm.NotificationLayout::type;
	}-*/;

	/**
	 * Adds the given html to the container
	 * 
	 * @param html
	 */
	public final void addHtml(HTML html) {
		this.addText(html + "");
	}

	/**
	 * Sets the as text variable value. Resets content of notification. Any
	 * html or text should be added after this method.
	 * 
	 * @param widget
	 */
	public final void setHtml(HTML html) {
		this.setText(html + "");
	}

	/**
	 * 
	 * Adds text to notification text message.
	 * 
	 * @param text
	 */
	public final native void addText(String text)
	/*-{
		this.text = this.text + text;
	}-*/;

	/**
	 * 
	 * Sets notification text message. Resets content of notification. Any
	 * widget text should be added after this method.
	 * 
	 * @param text
	 */
	public final native void setText(String text)
	/*-{
		this.text = text;
	}-*/;

	/**
	 * 
	 * @return this.Notification message
	 */
	public final native String getText()
	/*-{
		return this.text;
	}-*/;

	/**
	 * 
	 * @return this.Animation that is applied for notification view.
	 */
	public final native Animation getAnimation()
	/*-{
		return this.animation;
	}-*/;

	/**
	 * 
	 * Sets animate.css animation styles. This is the recommended way for
	 * animation.
	 * 
	 * @param open
	 *            Css style names for open animation
	 * @param close
	 *            Css style names for close animation
	 * @param easing
	 *            Animation easing type
	 * @param speed
	 *            Animation speed
	 */
	public final void setAnimateAnimation(AnimateCss open, AnimateCss close,
			Easing easing, int speed) {

		AnimateAnimation animateAnimation = (AnimateAnimation) AnimateAnimation
				.createObject();
		animateAnimation.setOpen(open);
		animateAnimation.setClose(close);
		animateAnimation.setEasing(easing);
		animateAnimation.setSpeed(speed);

		this.setNativeSpeed(speed/1000.0);
		this.setNativeAnimation(animateAnimation);
	}

	/**
	 * 
	 * Sets jQuery.animate animation properties. It is better to use animate.css
	 * style animation by using setAnimateAnimation
	 * 
	 * @param open
	 *            animation key-value properties
	 * @param close
	 *            animation key-value properties
	 * @param easing
	 *            Animation easing type
	 * @param speed
	 *            Animation speed
	 */
	public final void setJqueryAnimation(Map<String, String> open,
			Map<String, String> close, Easing easing, int speed) {

		JSONObject openJso = new JSONObject();
		for (Entry<String, String> openEntry : open.entrySet()) {
			openJso.put(openEntry.getKey(),
					new JSONString(openEntry.getValue()));
		}

		JSONObject closeJso = new JSONObject();
		for (Entry<String, String> closeEntry : close.entrySet()) {
			closeJso.put(closeEntry.getKey(),
					new JSONString(closeEntry.getValue()));
		}

		JqueryAnimation jqueryAnimation = (JqueryAnimation) JqueryAnimation
				.createObject();
		jqueryAnimation.setOpen(openJso);
		jqueryAnimation.setClose(closeJso);
		jqueryAnimation.setEasing(easing);
		jqueryAnimation.setSpeed(speed);

		this.setNativeSpeed(speed/1000.0);
		this.setNativeAnimation(jqueryAnimation);
	}

	private final native void setNativeAnimation(Animation animation)
	/*-{
		this.animation = animation;
	}-*/;

	private final native void setNativeSpeed(double speed) /*-{
		if($wnd.$('#animationDurationStyle').length > 0) {
			 console.log('found');
			//$wnd.alert('remove');
			//$wnd.$('#animationDurationStyle').remove();
		}
		
		$wnd.$('head').append('<style id="animationDurationStyle"> li { -webkit-animation-duration: '+speed+'s !important; animation-duration: '+speed+'s !important; } </style>');
	}-*/;
	
	/**
	 * 
	 * @return this.Notification type.
	 */
	public final NotificationType getType() {
		return NotificationType.valueOf(getNativeType().toUpperCase(
				Locale.ENGLISH));
	}

	private final native String getNativeType()
	/*-{
		return this.type;
	}-*/;

	/**
	 * Sets notification type. There are 3 types, SUCCESS, WARNING and ERROR.
	 * 
	 * @param type
	 */
	public final native void setType(NotificationType type)
	/*-{
		this.type = type.@com.biftektech.gwt.goty.shared.enm.NotificationType::type;
	}-*/;

	/**
	 * 
	 * @return this.true if queue feature is enabled
	 */
	public final native boolean isDismissQueue()
	/*-{
		return this.dismissQueue;
	}-*/;

	/**
	 * Set true to enable queue feature
	 * 
	 * @param dismissQueue
	 */
	public final native void setDismissQueue(boolean dismissQueue)
	/*-{
		this.dismissQueue = dismissQueue;
	}-*/;

	/**
	 * 
	 * @return this.custom template.
	 */
	public final native String getTemplate()
	/*-{
		return this.template;
	}-*/;

	/**
	 * Template is customized HTML wrapper for notification.
	 * 
	 * @param template
	 */
	public final native void setTemplate(String template)
	/*-{
		this.template = template;
	}-*/;

	/**
	 * 
	 * @return this.delay for closing event. Returns -1 if timeout is disabled.
	 */
	public final native int getTimeout() /*-{
		if(timeout === false) {
			return -1;
		} else {
			return this.timeout;
		}
	}-*/;

	/**
	 * Delay for closing event. Set -1 to disable timeout. It may be set -1 for
	 * sticky notifications
	 * 
	 * @param timeout
	 */
	public final native void setTimeout(int timeout) /*-{
		if(timeout === -1) {
			this.timeout = false;
		} else {
			this.timeout = timeout;
		}
		
	}-*/;

	/**
	 * 
	 * @return this.true if notification is forced to be at the beginning of que
	 */
	public final native boolean isForce()
	/*-{
		return this.force;
	}-*/;

	/**
	 * Adds notification to the beginning of queue when set to true
	 * 
	 * @param force
	 */
	public final native void setForce(boolean force)
	/*-{
		this.force = force;
	}-*/;

	/**
	 * 
	 * @return this.true if notification is preferred as modal
	 */
	public final native boolean isModal()
	/*-{
		return this.modal;
	}-*/;

	/**
	 * Set true to show notification as modal
	 * 
	 * @param modal
	 */
	public final native void setModal(boolean modal)
	/*-{
		this.modal = modal;
	}-*/;

	/**
	 * 
	 * @return this.maximum visible notification
	 */
	public final native int getMaxVisible()
	/*-{
		return this.maxVisible;
	}-*/;

	/**
	 * Max visible notification for dismissQueue true option
	 * 
	 * @param maxVisible
	 */
	public final native void setMaxVisible(int maxVisible)
	/*-{
		this.maxVisible = maxVisible;
	}-*/;

	/**
	 * 
	 * @return this.true if it is set as closer all notification before show
	 */
	public final native boolean isKiller()
	/*-{
		return this.killer;
	}-*/;

	/**
	 * Set true to close all notifications before show
	 * 
	 * @param killer
	 */
	public final native void setKiller(boolean killer)
	/*-{
		this.killer = killer;
	}-*/;
	
	/**
	 * 
	 * @return this.CloseWith that defines how notification is closed
	 */
	public final CloseWith[] getCloseWith() {
		String[] strCloseWith = getNativeCloseWith();
		CloseWith[] closeWith = new CloseWith[strCloseWith.length];
		for (int i = 0; i < strCloseWith.length; i++) {
			closeWith[i] = CloseWith.valueOf(strCloseWith[i].toUpperCase(Locale.ENGLISH));
		}
		return closeWith;
	}

	private final native String[] getNativeCloseWith()
	/*-{
		return this.closeWith;
	}-*/;

	/**
	 * Sets the close operation type of the notification. There are 4 types of
	 * CloseWith, CLICK, BUTTON, HOVER and BACKDROP. BACKDROP click will close
	 * all notifications.
	 * 
	 * @param closeWith
	 */
	public final native void addCloseWith(CloseWith closeWith)
	/*-{
		if(!('closeWith' in this)) {
			this.closeWith = [];
		}
		if (this.closeWith.indexOf(closeWith.@com.biftektech.gwt.goty.shared.enm.CloseWith::type) <= -1) {
			this.closeWith.push(closeWith.@com.biftektech.gwt.goty.shared.enm.CloseWith::type);
		}
	}-*/;
	
	/**
	 * Removes specified close with type
	 * 
	 * @param closeWith
	 */
	public final native void removeCloseWith(CloseWith closeWith) 
	/*-{
		if('closeWith' in this) {
			var ind = this.closeWith.indexOf(closeWith.@com.biftektech.gwt.goty.shared.enm.CloseWith::type);
			if(ind > -1) {
				this.closeWith.splice(ind, 1);
			}
		}
	}-*/;
	
	/**
	 * 
	 * @param closeWith
	 * @return true if the array contains given type of CloseWith, otherwise false
	 */
	public final native boolean hasCloseWith(CloseWith closeWith) 
	/*-{
		if('closeWith' in this) {
			return this.closeWith.indexOf(closeWith.@com.biftektech.gwt.goty.shared.enm.CloseWith::type) > -1;
		}
		return false;
	}-*/;

	/**
	 * 
	 * @return this.list of cuttons shown in the notification
	 */
	public final native NotificationButton[] getButtons()
	/*-{
		return this.buttons;
	}-*/;

	/**
	 * Sets button list to be displayed in the notification. Resets the button
	 * list before set
	 * 
	 * @param buttons
	 */
	public final void setButtons(NotificationButton[] buttons) {
		this.initButtons();
		for (NotificationButton notificationButton : buttons) {
			this.nativeAddButton(notificationButton);
		}
	}

	/**
	 * Adds given buttons to button list. Does not reset the button list
	 * 
	 * @param buttons
	 */
	public final void addButtons(NotificationButton[] buttons) {
		for (NotificationButton notificationButton : buttons) {
			this.nativeAddButton(notificationButton);
		}
	}

	private final native void initButtons() 
	/*-{
		this.buttons = [];
	}-*/;

	private final native void nativeAddButton(NotificationButton button)
	/*-{
		this.buttons[this.buttons.length] = button;
	}-*/;

	/**
	 * Adds single button at the end of button list
	 * 
	 * @param button
	 */
	public final void addButton(NotificationButton button) {
		if ((getButtons() + "").equals("false")) {
			initButtons();
		}
		this.nativeAddButton(button);
	}

	/**
	 * Sets the handler to be fired before show
	 * 
	 * @param onShow
	 */
	public final void setOnShow(NotificationCallback onShow) {
		this.setNativeCallback("onShow", onShow);
	}

	private final native void setNativeCallback(String callbackName,
			NotificationCallback callback)
	/*-{
		this.callback[callbackName] = function($noty) {
			callback.@com.biftektech.gwt.goty.shared.event.NotificationCallback::call(Lcom/biftektech/gwt/goty/shared/Goty;)($noty);
		};
	}-*/;

	/**
	 * Sets the handler to be fired before show
	 * 
	 * @param onShow
	 */
	public final void setAfterShow(NotificationCallback afterShow) {
		this.setNativeCallback("afterShow", afterShow);
	}

	/**
	 * Sets the handler to be fired before close
	 * 
	 * @param onShow
	 */
	public final void setOnClose(NotificationCallback onClose) {
		this.setNativeCallback("onClose", onClose);
	}

	/**
	 * Sets the handler to be fired after close
	 * 
	 * @param onShow
	 */
	public final void setAfterClose(NotificationCallback afterClose) {
		this.setNativeCallback("afterClose", afterClose);
	}

	/**
	 * Sets the handler to be fired when click to close
	 * 
	 * @param onShow
	 */
	public final void setOnCloseClick(NotificationCallback onCloseClick) {
		this.setNativeCallback("onCloseClick", onCloseClick);
	}

}
