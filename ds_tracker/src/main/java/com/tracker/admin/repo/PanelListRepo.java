package com.tracker.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracker.admin.model.PanelList;

@Repository
public interface PanelListRepo extends JpaRepository<PanelList, Long> {

}
