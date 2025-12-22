/**
 * 
 */
package com.czt.service;

import com.czt.entity.GymCenter;
import com.czt.entity.User;

/**
 * 
 */

public interface GymAdminInterface {

	public void validateNewGymOwner();

	public void checkpendingGymOwner();

	public GymCenter validateNewGymCenter(Long id, GymCenter updatedGymCenter);

	public void checkpendingGymRequest();

}
