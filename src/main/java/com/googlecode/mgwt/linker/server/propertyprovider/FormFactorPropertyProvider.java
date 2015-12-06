package com.googlecode.mgwt.linker.server.propertyprovider;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.googlecode.mgwt.linker.server.BindingProperty;

public class FormFactorPropertyProvider extends PropertyProviderBaseImpl {

	public static final BindingProperty phone = new BindingProperty("mgwt.formfactor", "phone");
	public static final BindingProperty tablet = new BindingProperty("mgwt.formfactor", "tablet");
	public static final BindingProperty desctop = new BindingProperty("mgwt.formfactor", "desktop");

	@Override
	public String getPropertyName() {
		return "mgwt.formfactor";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		String userAgent = getUserAgent(req);

		// android
		if (userAgent.contains("android")) {
			if (userAgent.contains("mobile")) {
				return "phone";
			} else {
				return "tablet";
			}

		}

		if (userAgent.contains("ipad")) {
			return "tablet";
		}

		if (userAgent.contains("iphone")) {
			return "phone";
		}

		return "desktop";
	}
}
