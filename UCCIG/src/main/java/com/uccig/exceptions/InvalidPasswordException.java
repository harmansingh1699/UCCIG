package com.uccig.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class InvalidPasswordException.
 */
public class InvalidPasswordException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1997753363232807009L;

	/**
	 * Instantiates a new invalid password exception.
	 */
	public InvalidPasswordException() {
		super("Invalid Password");
	}

	/**
	 * Instantiates a new invalid password exception.
	 *
	 * @param message the message
	 */
	public InvalidPasswordException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new invalid password exception.
	 *
	 * @param cause the cause
	 */
	public InvalidPasswordException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new invalid password exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public InvalidPasswordException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new invalid password exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public InvalidPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
