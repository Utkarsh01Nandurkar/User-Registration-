package in.userlogin.userregister.model;

public class OtpResponseDTO {
    private Long userId;
    private String phoneNo;
    private String otp;

    public OtpResponseDTO() {
        super();
        // Default constructor
    }

    public OtpResponseDTO(Long userId, String phoneNo, String otp) {
        super();
        this.userId = userId;
        this.phoneNo = phoneNo;
        this.otp = otp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}