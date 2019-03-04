package com.tracker.user.repository;

import com.tracker.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("FROM User u WHERE u.emailId=:emailId")
    public Optional<User> findByEmailId(@Param("emailId") String emailId);
}
