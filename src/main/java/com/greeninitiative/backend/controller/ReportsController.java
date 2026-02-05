package com.greeninitiative.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.greeninitiative.backend.repository.ContributionRepository;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin
public class ReportsController {

    @Autowired
    private ContributionRepository contributionRepository;

    // Initiative-wise contribution count
    @GetMapping("/initiative-count")
    public List<Map<String, Object>> getInitiativeReport() {

        List<Object[]> data = contributionRepository.countByInitiative();
        List<Map<String, Object>> result = new ArrayList<>();

        for (Object[] row : data) {
            Map<String, Object> map = new HashMap<>();
            map.put("initiativeId", row[0]);
            map.put("totalContributions", row[1]);
            result.add(map);
        }

        return result;
    }
}
