/**
 * 
 */
package com.czt.bean;

import java.security.Timestamp;
import java.time.LocalTime;

/**
 * 
 */
public class Slot {
	private int slotId;
	private String centerId;
	private LocalTime startTime;
	private LocalTime endtime;
	private String capacity;
	private String bookedCount;

	/**
	 * @param slotId
	 * @param centerId
	 * @param startTime
	 * @param endTime2
	 * @param capacity
	 * @param bookedCount
	 */
	public Slot(String centerId, LocalTime startTime, LocalTime endTime2, String capacity, String bookedCount) {
		super();
		this.centerId = centerId;
		this.startTime = startTime;
		this.endtime = endTime2;
		this.capacity = capacity;
		this.bookedCount = bookedCount;
	}

	/**
	 * @return the slotId
	 */
	public int getSlotId() {
		return slotId;
	}

	/**
	 * @param slotId the slotId to set
	 */
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	/**
	 * @return the centerId
	 */
	public String getCenterId() {
		return centerId;
	}

	/**
	 * @param centerId the centerId to set
	 */
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}

	/**
	 * @return the startTime
	 */
	public LocalTime getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endtime
	 */
	public LocalTime getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
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

	/**
	 * @return the bookedCount
	 */
	public String getBookedCount() {
		return bookedCount;
	}

	/**
	 * @param bookedCount the bookedCount to set
	 */
	public void setBookedCount(String bookedCount) {
		this.bookedCount = bookedCount;
	}

}
