package com.googlecode.mgwt.linker.server.propertyprovider;

import javax.servlet.http.HttpServletRequest;

public class HardwareBackButtonProvider extends PropertyProviderBaseImpl {

	/**
	 *
	 */
	private static final long serialVersionUID = -7478142138836802106L;

	@Override
	public String getPropertyName() {
		return "hardware.backbutton";
	}

	@Override
	public String getPropertyValue(HttpServletRequest req) throws PropertyProviderException {
		String ua = getUserAgent(req);

		return "yes"; // TODO: Disable in later versions, use yes as this property is collapsed
/*
		if (ua.contains("iphone")) {
			return "no";
		}
		else if (ua.contains("ipad")) {
			return "no";
		}
		else if (ua.contains("ipod")) {
			return "no";
		}
		else
			return "yes";
	*/
	}
}
