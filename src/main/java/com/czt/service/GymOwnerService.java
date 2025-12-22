/**
 * 
 */
package com.czt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czt.entity.GymCenter;
import com.czt.entity.User;
import com.czt.bean.Slot;
import com.czt.repository.GymCenterRepository;
import com.czt.repository.UserRepository;
import com.dao.exception.UserAlreadyExistsException;

/**
 * 
 */
@Service
public class GymOwnerService implements GymOwnerInterface {

	private final GymCenterRepository gymCenterRepository;

	@Autowired
	public GymOwnerService(GymCenterRepository gymCenterRepository) {
		this.gymCenterRepository = gymCenterRepository;
	}

	public void viewProfile() {
	}

	public boolean addaGymSlot() {
		return false;
	}

	public void viewOwnersRegisteredGymandslots() {
	}

	public void editOwnersRegisteredGymsandSlots() {
	}

	public GymCenter addGymCenter(GymCenter gymCenter) {

		return gymCenterRepository.save(gymCenter);
	}

	@Override
	public List getAllGymCenter() {
		return gymCenterRepository.findAll();
	}

	@Override
	public GymCenter updateymCenter(Long id, GymCenter updatedGymCenter) {
		if (gymCenterRepository.existsByCenterId(id)) {
			updatedGymCenter.setCenterId(id);
			return gymCenterRepository.save(updatedGymCenter);
		}
		return null;
	}

}
