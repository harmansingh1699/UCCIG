package com.uccig.service;

import com.uccig.action.accessingoperations.LoginAction;
import com.uccig.action.accessingoperations.RegistrationAction;
import com.uccig.service.accessingoperations.LoginService;
import com.uccig.service.accessingoperations.RegistrationService;

public class UCCIGServiceHelper {

	public static UCCIGService getServiceInstance(Object action) {
		UCCIGService service = null;

		if (action instanceof LoginAction)
			service = new LoginService();

		if (action instanceof RegistrationAction)
			service = new RegistrationService();

		return service;
	}
}
