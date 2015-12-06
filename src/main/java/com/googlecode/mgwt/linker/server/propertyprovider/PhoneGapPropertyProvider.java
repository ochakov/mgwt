/*
 * Copyright 2012 Daniel Kurka
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.linker.server.propertyprovider;

import javax.servlet.http.HttpServletRequest;

public class PhoneGapPropertyProvider extends PropertyProviderBaseImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = -411058962729141969L;

	@Override
	public String getPropertyName() {
		return "phonegap.env";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		String userAgent = getUserAgent(req).toLowerCase();

		if (userAgent.contains("iphone") ||
			userAgent.contains("ipod") ||
			userAgent.contains("ipad") ||
			userAgent.contains("android") ||
			userAgent.contains("blackBerry") ||
			userAgent.contains("cordova") ||
			userAgent.contains("edge") ||
			userAgent.contains("windows phone") ||
			userAgent.contains("iemobile")) {
				return "yes";
			} else {
				return "no";
			}
	}
}
