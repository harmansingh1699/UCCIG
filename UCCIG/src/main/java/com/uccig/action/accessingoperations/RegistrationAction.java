package com.uccig.action.accessingoperations;

import com.opensymphony.xwork2.ActionSupport;
import com.uccig.dto.accessingoperations.RegistrationDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class RegistrationAction.
 */
public class RegistrationAction extends ActionSupport{

	/** The user name. */
	private String userName;

	/** The password. */
	private String password;

	/** The repassword. */
	private String repassword;

	/** The email address. */
	private String emailAddress;

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName
	 *            the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * Gets the repassword.
	 *
	 * @return the repassword
	 */
	public String getRepassword() {
		return repassword;
	}

	/**
	 * Sets the repassword.
	 *
	 * @param repassword
	 *            the new repassword
	 */
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

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
	 * Execute.
	 *
	 * @return the string
	 */
	public String execute() {
		return "success";

	}

	public RegistrationDTO createDTO() {
		// TODO Auto-generated method stub
		return null;
	}

}
