/**
 * 
 */
package com.czt.service;

import java.util.List;

import com.czt.entity.*;

/**
 * 
 */
public interface GymOwnerInterface {

	public void viewProfile();

	public boolean addaGymSlot();

	public void viewOwnersRegisteredGymandslots();

	public void editOwnersRegisteredGymsandSlots();

	public GymCenter addGymCenter(GymCenter gymCenter);

	public List<GymCenter> getAllGymCenter();
}
