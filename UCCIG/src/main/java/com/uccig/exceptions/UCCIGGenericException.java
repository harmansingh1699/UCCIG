package com.uccig.exceptions;

// TODO: Auto-generated Javadoc
/**
 * The Class UCCIGGenericException.
 */
public class UCCIGGenericException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1997753363232807009L;

	/**
	 * Instantiates a new UCCIG generic exception.
	 */
	public UCCIGGenericException() {
	}

	/**
	 * Instantiates a new UCCIG generic exception.
	 *
	 * @param message the message
	 */
	public UCCIGGenericException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new UCCIG generic exception.
	 *
	 * @param cause the cause
	 */
	public UCCIGGenericException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new UCCIG generic exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public UCCIGGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new UCCIG generic exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public UCCIGGenericException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
