package com.tracker.repository.projectTracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.model.projectTracker.Status;


	@Repository
	public interface StatusRepo extends JpaRepository<Status, Long>{

}
