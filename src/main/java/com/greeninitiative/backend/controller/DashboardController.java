package com.greeninitiative.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.greeninitiative.backend.repository.UserRepository;
import com.greeninitiative.backend.repository.InitiativeRepository;
import com.greeninitiative.backend.repository.ContributionRepository;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin
public class DashboardController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InitiativeRepository initiativeRepository;

    @Autowired
    private ContributionRepository contributionRepository;

    // Total Users
    @GetMapping("/total-users")
    public long getTotalUsers() {
        return userRepository.count();
    }

    // Total Initiatives
    @GetMapping("/total-initiatives")
    public long getTotalInitiatives() {
        return initiativeRepository.count();
    }

    // Total Contributions
    @GetMapping("/total-contributions")
    public long getTotalContributions() {
        return contributionRepository.count();
    }
}
