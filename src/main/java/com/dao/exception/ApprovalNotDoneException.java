/**
 * 
 */
package com.dao.exception;

/**
 * 
 */
public class ApprovalNotDoneException extends Exception{
	
	public ApprovalNotDoneException() {
        super("Approval has not been completed.");
    }

    public ApprovalNotDoneException(String message) {
        super(message);
    }

}
