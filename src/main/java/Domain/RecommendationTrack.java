package Domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cfr_recommendation_track")
public class RecommendationTrack {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;
    @Column(name = "cfr_user_id")
    public Long userId;
    @Column(name = "total_recommendation_problems")
    public Long totalRecommendationProblems;
    @Column(name = "solved_from_recommendation_problems")
    public Long solvedFromRecommendationProblems;
    @Column(name = "status")
    public byte status;
    @Column(name = "created_by_id")
    public Long createdById;
    @Column(name = "updated_by_id")
    public Long updatedById;
    @Column(name = "created_at")
    public LocalDateTime createdAt;
    @Column(name = "updated_at")
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
