package com.greeninitiative.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greeninitiative.backend.entity.Contribution;

public interface ContributionRepository extends JpaRepository<Contribution, Long> {

    List<Contribution> findByUserId(Long userId);
}
