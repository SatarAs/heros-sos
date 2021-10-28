package com.digiwin.herossos.repository;

import com.digiwin.herossos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String emailAddress);
}