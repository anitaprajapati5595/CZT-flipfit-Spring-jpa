/**
 * 
 */
package com.dao.exception;

/**
 * 
 */
public class SlotNotAvailableException extends Exception {
	
	public SlotNotAvailableException() {
        super("Requested slot is not available.");
    }

    public SlotNotAvailableException(String message) {
        super(message);
    }

}
