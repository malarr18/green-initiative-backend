package com.greeninitiative.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.greeninitiative.backend.entity.Initiative;
import com.greeninitiative.backend.repository.InitiativeRepository;

@RestController
@RequestMapping("/api/initiatives")
@CrossOrigin
public class InitiativeController {

    @Autowired
    private InitiativeRepository initiativeRepository;

    // Add Initiative
    @PostMapping("/add")
    public Initiative addInitiative(@RequestBody Initiative initiative) {
        return initiativeRepository.save(initiative);
    }

    // Get All Initiatives
    @GetMapping("/all")
    public List<Initiative> getAllInitiatives() {
        return initiativeRepository.findAll();
    }

    // Get Initiative By ID
    @GetMapping("/{id}")
    public Initiative getInitiativeById(@PathVariable Long id) {
        return initiativeRepository.findById(id).orElse(null);
    }
}
