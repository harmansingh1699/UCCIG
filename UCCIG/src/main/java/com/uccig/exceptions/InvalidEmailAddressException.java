package com.uccig.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class InvalidEmailAddressException.
 */
public class InvalidEmailAddressException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1997753363232807009L;

	/**
	 * Instantiates a new invalid email address exception.
	 */
	public InvalidEmailAddressException() {
		super("Invalid Email Address");
	}

	/**
	 * Instantiates a new invalid email address exception.
	 *
	 * @param message the message
	 */
	public InvalidEmailAddressException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid email address exception.
	 *
	 * @param cause the cause
	 */
	public InvalidEmailAddressException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid email address exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidEmailAddressException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid email address exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public InvalidEmailAddressException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
