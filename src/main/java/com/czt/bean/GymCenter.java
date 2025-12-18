/**
 * 
 */
package com.czt.bean;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 */
public class GymCenter {

	private int centerId;
	private String centerName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phonNumber;
	private String email;
	private LocalTime openingTime;
	private LocalTime closingTime;
	private String managerName;
	private String capacity;

	public GymCenter(String centerName, String address, String city, String state, String zipCode, String phonNumber,
			String email, LocalTime openingTime, LocalTime closingTime, String managerName, String capacity) {
		super();

		this.centerName = centerName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phonNumber = phonNumber;
		this.email = email;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.managerName = managerName;
		this.capacity = capacity;
	}

	/**
	 * @return the centerId
	 */
	public int getCenterId() {
		return centerId;
	}

	/**
	 * @param centerId the centerId to set
	 */
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	/**
	 * @return the centerName
	 */
	public String getCenterName() {
		return centerName;
	}

	/**
	 * @param centerName the centerName to set
	 */
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the phonNumber
	 */
	public String getPhonNumber() {
		return phonNumber;
	}

	/**
	 * @param phonNumber the phonNumber to set
	 */
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the openingTime
	 */
	public LocalTime getOpeningTime() {
		return openingTime;
	}

	/**
	 * @param openingTime the openingTime to set
	 */
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	/**
	 * @return the closingTime
	 */
	public LocalTime getClosingTime() {
		return closingTime;
	}

	/**
	 * @param closingTime the closingTime to set
	 */
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
