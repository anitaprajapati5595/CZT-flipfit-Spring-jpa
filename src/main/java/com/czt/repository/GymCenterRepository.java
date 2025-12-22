/**
 * 
 */
package com.czt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.czt.entity.GymCenter;

/**
 * 
 */
public interface GymCenterRepository extends JpaRepository<GymCenter, Long> {

	boolean existsByCenterId(Long id);

}
