package com.googlecode.mgwt.linker.server.propertyprovider;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.googlecode.mgwt.linker.server.BindingProperty;

public class MgwtOsPropertyProvider extends PropertyProviderBaseImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = -3624651858511204668L;
	public static final BindingProperty iPhone = new BindingProperty("mgwt.os", "iphone");
	public static final BindingProperty retina = new BindingProperty("mgwt.os", "retina");
	public static final BindingProperty iPhone_undefined = new BindingProperty("mgwt.os", "iphone_undefined");

	public static final BindingProperty iPad = new BindingProperty("mgwt.os", "ipad");
	public static final BindingProperty iPad_retina = new BindingProperty("mgwt.os", "ipad_retina");
	public static final BindingProperty iPad_undefined = new BindingProperty("mgwt.os", "ipad_undefined");

	@Override
	public String getPropertyName() {
		return "mgwt.os";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		String userAgent = getUserAgent(req);

		// android
		if (userAgent.contains("android")) {
			return "android";
		}
		if (userAgent.contains("ipad")) {
			return "ios";
		}
		if (userAgent.contains("iphone")) {
			return "ios";
		}
		if (userAgent.contains("ipod")) {
			return "ios";
		}

		return "desktop";
	}

	public String getRetinaCookieValue(HttpServletRequest req) {

		Cookie[] cookies = req.getCookies();
		if (cookies == null)
			return null;

		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if ("mgwt_ios_retina".equals(cookie.getName()))
				return (cookie.getValue());
		}
		return null;
	}
}
