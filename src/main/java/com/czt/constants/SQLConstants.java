/**
 * 
 */
package com.czt.constants;

/**
 * 
 */
public class SQLConstants {
	final static public String SQL_REGISTRATION ="INSERT INTO registrationdb (firstName, lastName, email,mobileNumber,addrress) VALUES (?, ?, ?, ?, ?)";
	final static public String SQL_REGISTRATION_Read = "SELECT * FROM registrationdb";
	final static public String SQL_USER_LOGIN= "SELECT * FROM User WHERE username=? AND password=? AND role=?" ;
	
	
	/*** Gym center  ****/
	
	final static public String SQL_GYM_CENETR_REGISTRATION ="INSERT INTO gymCenter (center_name, address, city,state,zip_code,phone_number,email,opening_time,closing_time,manager_name,capacity)"
			+ " VALUES (?, ?, ?, ?, ? ,? ,? ,? ,? ,? ,?)";
	final static public String SQL__GYM_CENETR_REGISTRATION_Read = "SELECT * FROM gymCenter";
	
	
     /*** Gym slot  ****/
	
	final static public String SQL_GYM_SLOT_REGISTRATION ="INSERT INTO slot (center_id, start_time, end_time,capacity,booked_count)"
			+ " VALUES (?, ?, ?, ?, ?)";
	final static public String SQL__GYM_SLOT_REGISTRATION_Read = "SELECT * FROM slot";
	

}
