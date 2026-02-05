package com.greeninitiative.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.greeninitiative.backend.entity.Contribution;
import com.greeninitiative.backend.repository.ContributionRepository;

@RestController
@RequestMapping("/api/contributions")
@CrossOrigin
public class ContributionController {

    @Autowired
    private ContributionRepository contributionRepository;

    // Join Initiative API
    @PostMapping("/join")
    public Contribution joinInitiative(@RequestBody Contribution contribution) {
        return contributionRepository.save(contribution);
    }

    // My Contributions API
    @GetMapping("/user/{userId}")
    public List<Contribution> getUserContributions(@PathVariable Long userId) {
        return contributionRepository.findByUserId(userId);
    }
}
