package in.userlogin.userregister.model;

public class PhoneRequestDTO {
	private ISDCode isdcode;
    public ISDCode getIsdcode() {
		return isdcode;
	}
	public void setIsdcode(ISDCode isdcode) {
		this.isdcode = isdcode;
	}
	private String phoneNo;

    public PhoneRequestDTO() {}

    public PhoneRequestDTO(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
