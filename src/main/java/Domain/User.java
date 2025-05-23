package Domain;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cfr_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "email")
    public String email;
    @Column(name = "cfr_password")
    public String cfrPassword;
    @Column(name = "cf_handle")
    public String cfHandle;
    @Column(name = "status")
    public byte status;
    @Column(name = "created_at")
    public LocalDateTime createdAt;
    @Column(name = "updated_at")
    public LocalDateTime updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCfrPassword() {
        return cfrPassword;
    }

    public void setCfrPassword(String cfrPassword) {
        this.cfrPassword = cfrPassword;
    }

    public String getCfHandle() {
        return cfHandle;
    }

    public void setCfHandle(String cfHandle) {
        this.cfHandle = cfHandle;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
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
