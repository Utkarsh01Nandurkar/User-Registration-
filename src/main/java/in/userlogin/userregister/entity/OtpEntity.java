package in.userlogin.userregister.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "otp")
public class OtpEntity {
	@Id
	private Long id;
	private String otp;

	@OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private IdEntity user;

    public OtpEntity() {}

    public OtpEntity(String otp, IdEntity user) {
        this.otp = otp;
        this.user = user;
    }

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public IdEntity getUser() {
		return user;
	}

	public void setUser(IdEntity user) {
		this.user = user;
	}
    
    
    
}
