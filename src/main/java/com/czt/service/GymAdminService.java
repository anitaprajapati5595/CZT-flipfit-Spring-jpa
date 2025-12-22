/**
 * 
 */
package com.czt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czt.entity.GymCenter;
import com.czt.entity.User;
import com.czt.repository.GymCenterRepository;

/**
 * 
 */
@Service
public class GymAdminService implements GymAdminInterface {

	private final GymCenterRepository gymCenterRepository;

	@Autowired
	public GymAdminService(GymCenterRepository gymCenterRepository) {
		this.gymCenterRepository = gymCenterRepository;
	}

	public void validateNewGymOwner() {
	}

	public void checkpendingGymOwner() {
	}

	public void checkpendingGymRequest() {
	}

	@Override
	public GymCenter validateNewGymCenter(Long id, GymCenter updatedGymCenter) {
		if (gymCenterRepository.existsByCenterId(id)) {
			updatedGymCenter.setCenterId(id);
			return gymCenterRepository.save(updatedGymCenter);
		}
		return null;

	}

}
