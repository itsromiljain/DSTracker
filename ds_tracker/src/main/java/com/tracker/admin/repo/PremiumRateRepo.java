package com.tracker.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.admin.model.PremiumRate;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumRateRepo extends JpaRepository<PremiumRate, Long> {

}
