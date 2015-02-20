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

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Biftek Technology
 * 
 */
public interface GotyClientBundle extends ClientBundle {
	static final GotyClientBundle INSTANCE = GWT.create(GotyClientBundle.class);

	@Source("resource/js/jquery-1.11.2.min.cache.js")
	TextResource jQuery();

	@Source("resource/js/jquery.noty.packaged.cache.min.js")
	TextResource noty();

}