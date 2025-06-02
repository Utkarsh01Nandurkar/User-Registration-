package in.userlogin.userregister.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
@Entity
@Table(name="account_creation")
public class AccountCreationEntity {
	@Id
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private IdEntity user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public IdEntity getUser() {
		return user;
	}

	public void setUser(IdEntity user) {
		this.user = user;
	}
}
