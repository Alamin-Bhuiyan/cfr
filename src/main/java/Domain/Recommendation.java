package Domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cfr_recommendations")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;
    @Column(name = "cfr_user_id")
    public Long userId;
    @Column(name = "cf_problem_id")
    public String cfProblemId;
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

    public String getCfProblemId() {
        return cfProblemId;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setCfProblemId(String cfProblemId) {
        this.cfProblemId = cfProblemId;
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
