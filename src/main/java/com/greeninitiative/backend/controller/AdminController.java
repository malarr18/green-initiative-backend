package com.greeninitiative.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.greeninitiative.backend.entity.User;
import com.greeninitiative.backend.entity.Initiative;
import com.greeninitiative.backend.repository.UserRepository;
import com.greeninitiative.backend.repository.InitiativeRepository;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InitiativeRepository initiativeRepository;

    // ✅ View all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ Delete user by ID
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    // ✅ Update initiative
    @PutMapping("/initiative/{id}")
    public Initiative updateInitiative(@PathVariable Long id, @RequestBody Initiative initiative) {

        Initiative existing = initiativeRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setTitle(initiative.getTitle());
            existing.setDescription(initiative.getDescription());
            existing.setDate(initiative.getDate());
            existing.setLocation(initiative.getLocation());
            existing.setTarget(initiative.getTarget());

            return initiativeRepository.save(existing);
        }

        return null;
    }

    // ✅ Delete initiative
    @DeleteMapping("/initiative/{id}")
    public void deleteInitiative(@PathVariable Long id) {
        initiativeRepository.deleteById(id);
    }
}
