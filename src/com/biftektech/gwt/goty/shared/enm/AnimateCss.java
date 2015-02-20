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
package com.biftektech.gwt.goty.shared.enm;

/**
 * @author Biftek Technology
 *
 */
public enum AnimateCss {

	BOUNCE("animated bounce"),
	FLASH("animated flash"),
	PULSE("animated pulse"),
	RUBBERBAND("animated rubberBand"),
	SHAKE("animated shake"),
	SWING("animated swing"),
	TADA("animated tada"),
	WOBBLE("animated wobble"),
	BOUNCEIN("animated bounceIn"),
	BOUNCEINDOWN("animated bounceInDown"),
	BOUNCEINLEFT("animated bounceInLeft"),
	BOUNCEINRIGHT("animated bounceInRight"),
	BOUNCEINUP("animated bounceInUp"),
	BOUNCEOUT("animated bounceOut"),
	BOUNCEOUTDOWN("animated bounceOutDown"),
	BOUNCEOUTLEFT("animated bounceOutLeft"),
	BOUNCEOUTRIGHT("animated bounceOutRight"),
	BOUNCEOUTUP("animated bounceOutUp"),
	FADEIN("animated fadeIn"),
	FADEINDOWN("animated fadeInDown"),
	FADEINDOWNBIG("animated fadeInDownBig"),
	FADEINLEFT("animated fadeInLeft"),
	FADEINLEFTBIG("animated fadeInLeftBig"),
	FADEINRIGHT("animated fadeInRight"),
	FADEINRIGHTBIG("animated fadeInRightBig"),
	FADEINUP("animated fadeInUp"),
	FADEINUPBIG("animated fadeInUpBig"),
	FADEOUT("animated fadeOut"),
	FADEOUTDOWN("animated fadeOutDown"),
	FADEOUTDOWNBIG("animated fadeOutDownBig"),
	FADEOUTLEFT("animated fadeOutLeft"),
	FADEOUTLEFTBIG("animated fadeOutLeftBig"),
	FADEOUTRIGHT("animated fadeOutRight"),
	FADEOUTRIGHTBIG("animated fadeOutRightBig"),
	FADEOUTUP("animated fadeOutUp"),
	FADEOUTUPBIG("animated fadeOutUpBig"),
	FLIPINX("animated flipInX"),
	FLIPINY("animated flipInY"),
	FLIPOUTX("animated flipOutX"),
	FLIPOUTY("animated flipOutY"),
	LIGHTSPEEDIN("animated lightSpeedIn"),
	LIGHTSPEEDOUT("animated lightSpeedOut"),
	ROTATEIN("animated rotateIn"),
	ROTATEINDOWNLEFT("animated rotateInDownLeft"),
	ROTATEINDOWNRIGHT("animated rotateInDownRight"),
	ROTATEINUPLEFT("animated rotateInUpLeft"),
	ROTATEINUPRIGHT("animated rotateInUpRight"),
	ROTATEOUT("animated rotateOut"),
	ROTATEOUTDOWNLEFT("animated rotateOutDownLeft"),
	ROTATEOUTDOWNRIGHT("animated rotateOutDownRight"),
	ROTATEOUTUPLEFT("animated rotateOutUpLeft"),
	ROTATEOUTUPRIGHT("animated rotateOutUpRight"),
	HINGE("animated hinge"),
	ROLLIN("animated rollIn"),
	ROLLOUT("animated rollOut"),
	ZOOMIN("animated zoomIn"),
	ZOOMINDOWN("animated zoomInDown"),
	ZOOMINLEFT("animated zoomInLeft"),
	ZOOMINRIGHT("animated zoomInRight"),
	ZOOMINUP("animated zoomInUp"),
	ZOOMOUT("animated zoomOut"),
	ZOOMOUTDOWN("animated zoomOutDown"),
	ZOOMOUTLEFT("animated zoomOutLeft"),
	ZOOMOUTRIGHT("animated zoomOutRight"),
	ZOOMOUTUP("animated zoomOutUp"),
	SLIDEINDOWN("animated slideInDown"),
	SLIDEINLEFT("animated slideInLeft"),
	SLIDEINRIGHT("animated slideInRight"),
	SLIDEINUP("animated slideInUp"),
	SLIDEOUTDOWN("animated slideOutDown"),
	SLIDEOUTLEFT("animated slideOutLeft"),
	SLIDEOUTRIGHT("animated slideOutRight"),
	SLIDEOUTUP("animated slideOutUp");

	public final String type;
	AnimateCss(String type) {
		this.type = type;
	}
}
