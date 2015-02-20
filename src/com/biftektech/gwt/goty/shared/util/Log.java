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
package com.biftektech.gwt.goty.shared.util;

import java.util.logging.Logger;

/**
 * @author Biftek Technology
 *
 */
public class Log {
	
	private static final Logger logger = Logger.getLogger("GotyLogger");
    
	public static void i(String message) {
		logger.info(message);
	}
	public static void e(String message) {
		logger.severe(message);
	}
	public static void w(String message) {
		logger.warning(message);
	}

}