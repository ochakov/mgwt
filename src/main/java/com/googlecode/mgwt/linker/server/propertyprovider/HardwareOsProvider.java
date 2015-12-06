package com.googlecode.mgwt.linker.server.propertyprovider;

import javax.servlet.http.HttpServletRequest;

public class HardwareOsProvider extends PropertyProviderBaseImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = -7478442118336402106L;

	@Override
	public String getPropertyName() {
		return "hardware.os";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		String ua = getUserAgent(req);

		if (ua.contains("edge") || ua.contains("iemobile") || ua.contains("windows phone")) {
			return "Windows";
		}
		else if (ua.contains("iphone")) {
			return "iOS";
		}
		else if (ua.contains("ipad")) {
			return "iOS";
		}
		else if (ua.contains("ipod")) {
			return "iOS";
		}
		else if (ua.contains("android")) {
			return "Android";
		}
		else
			return "Other";
	}
}
