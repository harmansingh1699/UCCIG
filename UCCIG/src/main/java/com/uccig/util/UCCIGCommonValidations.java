package com.uccig.util;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class UCCIGCommonValidations {

	public static boolean validateString(String data) {
		return data != null && data.trim().length() > 0;
	}

	public static boolean isValidEmailAddress(String email) {
		boolean result = true;
		try {
			InternetAddress emailAddr = new InternetAddress(email);
			emailAddr.validate();
		} catch (AddressException ex) {
			result = false;
		}
		return result;
	}

}
