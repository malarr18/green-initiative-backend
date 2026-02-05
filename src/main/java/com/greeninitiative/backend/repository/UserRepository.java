package com.greeninitiative.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greeninitiative.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // For login
    User findByEmailAndPassword(String email, String password);
}
