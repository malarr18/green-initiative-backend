package com.greeninitiative.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greeninitiative.backend.entity.Initiative;

public interface InitiativeRepository extends JpaRepository<Initiative, Long> {
}
