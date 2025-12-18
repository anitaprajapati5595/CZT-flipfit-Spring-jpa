/**
 * 
 */
package com.dao.exception;

/**
 * 
 */
public class RegistrationNotDoneException extends Exception{
	
	public RegistrationNotDoneException() {
        
    }

    public String getMessage()
    {
    	return "Oops Registration not Done";
    }

}
