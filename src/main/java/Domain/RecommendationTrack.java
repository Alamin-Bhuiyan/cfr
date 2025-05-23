package Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class RecommendationTrack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public Long userId;
    public Long totalRecommendationProblems;
    public Long solvedFromRecommendationProblems;
    public byte status;
    public Long createdById;
    public Long updatedById;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

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

    public Long getTotalRecommendationProblems() {
        return totalRecommendationProblems;
    }

    public void setTotalRecommendationProblems(Long totalRecommendationProblems) {
        this.totalRecommendationProblems = totalRecommendationProblems;
    }

    public Long getSolvedFromRecommendationProblems() {
        return solvedFromRecommendationProblems;
    }

    public void setSolvedFromRecommendationProblems(Long solvedFromRecommendationProblems) {
        this.solvedFromRecommendationProblems = solvedFromRecommendationProblems;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public Long getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Long updatedById) {
        this.updatedById = updatedById;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
