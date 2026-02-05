package com.greeninitiative.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greeninitiative.backend.entity.Contribution;

public interface ContributionRepository extends JpaRepository<Contribution, Long> {

    List<Contribution> findByUserId(Long userId);

    // Report 1: count per initiative
    @Query("SELECT c.initiativeId, COUNT(c) FROM Contribution c GROUP BY c.initiativeId")
    List<Object[]> countByInitiative();
}
