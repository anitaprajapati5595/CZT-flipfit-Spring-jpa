/**
 * 
 */
package com.czt.bean;

import java.util.Date;

/**
 * 
 */
public class Payment {
	private int paymentId;
	private String subscriptionPlan;
	private Date paymentDate;
	private String paymentType;

	/**
	 * @return the paymentId
	 */
	public int getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId the paymentId to set
	 */
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return the subscriptionPlan
	 */
	public String getSubscriptionPlan() {
		return subscriptionPlan;
	}

	/**
	 * @param subscriptionPlan the subscriptionPlan to set
	 */
	public void setSubscriptionPlan(String subscriptionPlan) {
		this.subscriptionPlan = subscriptionPlan;
	}

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}
