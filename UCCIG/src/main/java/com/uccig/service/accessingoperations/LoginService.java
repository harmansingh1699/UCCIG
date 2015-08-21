package com.uccig.service.accessingoperations;

import com.uccig.dao.accessingoperations.LoginDAO;
import com.uccig.dto.accessingoperations.LoginDTO;
import com.uccig.exceptions.InvalidEmailAddressException;
import com.uccig.exceptions.InvalidPasswordException;
import com.uccig.service.UCCIGService;
import com.uccig.util.UCCIGCommonValidations;
import com.uccig.util.security.SaltTextEncryption;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginService.
 */
public class LoginService implements UCCIGService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uccig.service.IService#processRequest()
	 */
	public void processRequest(Object dto) throws Exception {
		validateRequest(dto);
		String emailAddress = ((LoginDTO) dto).getEmailAddress();
		String password = ((LoginDTO) dto).getPassword();
		if (!SaltTextEncryption.getInstance().validateStrings(password, new LoginDAO().getPassword(emailAddress)))
			throw new InvalidPasswordException("Incorrect Password");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.uccig.service.IService#validateRequest()
	 */
	public void validateRequest(Object dto) throws Exception {
		String emailAddress = ((LoginDTO) dto).getEmailAddress();
		String password = ((LoginDTO) dto).getPassword();
		if (!UCCIGCommonValidations.validateString(emailAddress))
			throw new InvalidEmailAddressException();

		if (!UCCIGCommonValidations.isValidEmailAddress(emailAddress))
			throw new InvalidEmailAddressException();

		if (!UCCIGCommonValidations.validateString(password))
			throw new InvalidPasswordException();

		if (!new LoginDAO().emailAddressExists(emailAddress))
			throw new InvalidEmailAddressException("Email Address does not exists");
	}

}
