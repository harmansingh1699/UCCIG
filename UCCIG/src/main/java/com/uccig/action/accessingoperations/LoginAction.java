/*
 * 
 */
package com.uccig.action.accessingoperations;

import com.opensymphony.xwork2.ActionSupport;
import com.uccig.dto.accessingoperations.LoginDTO;
import com.uccig.exceptions.InvalidEmailAddressException;
import com.uccig.exceptions.InvalidPasswordException;
import com.uccig.exceptions.UCCIGGenericException;
import com.uccig.service.UCCIGService;
import com.uccig.service.UCCIGServiceHelper;
import com.uccig.util.UCCIGConstants;

// TODO: Auto-generated Javadoc
/**
 * The Class LoginAction is responsible for handling the login action.
 */
public class LoginAction extends ActionSupport {

	/** The email address. */
	private String emailAddress;

	/** The password. */
	private String password;

	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Sets the email address.
	 *
	 * @param emailAddress
	 *            the new email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Starting point of any struts request to login.action
	 *
	 * @return the string
	 */
	public String execute() {
		String result = "error";
		UCCIGService service = UCCIGServiceHelper.getServiceInstance(this);
		try {
			service.processRequest(createDTO());

			result = "success";

		} catch (InvalidEmailAddressException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
		} catch (InvalidPasswordException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
		} catch (UCCIGGenericException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(UCCIGConstants.GENERIC_ERROR_MESSAGE);
		}

		return result;
	}

	/**
	 * Creates the dto.
	 *
	 * @return the login dto
	 */
	public LoginDTO createDTO() {
		LoginDTO dto = new LoginDTO();
		System.out.println(getEmailAddress());
		dto.setEmailAddress(getEmailAddress());
		dto.setPassword(getPassword());
		return dto;
	}

}
