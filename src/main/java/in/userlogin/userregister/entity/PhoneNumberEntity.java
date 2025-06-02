package in.userlogin.userregister.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "phone_number")
public class PhoneNumberEntity {
	@Id
	private Long id;
	
	private String phoneNo;
	    @OneToOne
	    @MapsId
	    @JoinColumn(name = "user_id")
	    private IdEntity user;

	    public PhoneNumberEntity() {}

	    public PhoneNumberEntity(String phoneNo, IdEntity user) {
	        this.phoneNo = phoneNo;
	        this.user = user;
	    }
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public IdEntity getUser() {
		return user;
	}

	public void setUser(IdEntity user) {
		this.user = user;
	}
    
    
}
