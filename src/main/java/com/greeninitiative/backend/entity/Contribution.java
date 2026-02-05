package com.greeninitiative.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contributions")
public class Contribution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private Long initiativeId;

    private String status;

    private String contributionDate;

    public Contribution() {}

    public Contribution(Long userId, Long initiativeId, String status, String contributionDate) {
        this.userId = userId;
        this.initiativeId = initiativeId;
        this.status = status;
        this.contributionDate = contributionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInitiativeId() {
        return initiativeId;
    }

    public void setInitiativeId(Long initiativeId) {
        this.initiativeId = initiativeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContributionDate() {
        return contributionDate;
    }

    public void setContributionDate(String contributionDate) {
        this.contributionDate = contributionDate;
    }
}
