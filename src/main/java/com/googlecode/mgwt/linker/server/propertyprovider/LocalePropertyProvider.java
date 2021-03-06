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

public class LocalePropertyProvider extends PropertyProviderBaseImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = -411058962729141969L;

	@Override
	public String getPropertyName() {
		return "locale";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		return "ru_RU"; // This property is collapsed, return the last value. TODO: might be a problem when changes to something greater

/*		Cookie[] cookies = req == null ? null : req.getCookies();
		if (cookies != null)
		{
			for (Cookie cookie : cookies)
			{
				if (cookie != null && cookie.getName().equalsIgnoreCase("Locale"))
					return cookie.getValue();
			}
		}
		if (req.getParameter("locale") != null)
			return req.getParameter("locale");

		return "en_US";*/
	}

}
