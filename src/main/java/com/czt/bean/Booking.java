/**
 * 
 */
package com.czt.bean;

import java.security.Timestamp;

/**
 * 
 */
public class Booking {

	private int bookingId;

	private String bookingStatus;
	private String bookingName;
	private String bookingDescription;
	private Timestamp bookingTime;

	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the bookingStatus
	 */
	public String getBookingStatus() {
		return bookingStatus;
	}

	/**
	 * @param bookingStatus the bookingStatus to set
	 */
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	/**
	 * @return the bookingName
	 */
	public String getBookingName() {
		return bookingName;
	}

	/**
	 * @param bookingName the bookingName to set
	 */
	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	/**
	 * @return the bookingDescription
	 */
	public String getBookingDescription() {
		return bookingDescription;
	}

	/**
	 * @param bookingDescription the bookingDescription to set
	 */
	public void setBookingDescription(String bookingDescription) {
		this.bookingDescription = bookingDescription;
	}

	/**
	 * @return the bookingTime
	 */
	public Timestamp getBookingTime() {
		return bookingTime;
	}

	/**
	 * @param bookingTime the bookingTime to set
	 */
	public void setBookingTime(Timestamp bookingTime) {
		this.bookingTime = bookingTime;
	}

}
