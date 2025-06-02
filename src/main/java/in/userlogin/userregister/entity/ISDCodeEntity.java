package in.userlogin.userregister.entity;

import in.userlogin.userregister.model.ISDCode;
import jakarta.persistence.*;
@Entity
@Table(name = "isd_code")
public class ISDCodeEntity {
	@Id
	private Long id;
	@Enumerated(EnumType.STRING)
	private ISDCode  isdCode;
	
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

	public ISDCode getIsdCode() {
		return isdCode;
	}

	public void setIsdCode(ISDCode isdCode) {
		this.isdCode = isdCode;
	}

	public IdEntity getUser() {
		return user;
	}

	public void setUser(IdEntity user) {
		this.user = user;
	}
	
}
