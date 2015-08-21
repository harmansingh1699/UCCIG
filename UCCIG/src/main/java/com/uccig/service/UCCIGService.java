package com.uccig.service;

// TODO: Auto-generated Javadoc
/**
 * The Interface IService.
 */
public interface UCCIGService {

	/**
	 * Process request.
	 *
	 * @return true, if successful
	 */
	public void processRequest(Object dto) throws Exception;
	
	/**
	 * Validate request.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public void validateRequest(Object dto) throws Exception;
}
