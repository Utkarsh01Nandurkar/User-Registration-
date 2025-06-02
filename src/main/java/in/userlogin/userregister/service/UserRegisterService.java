package in.userlogin.userregister.service;
import java.time.LocalDateTime;
import java.util.Random;
import in.userlogin.userregister.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.userlogin.userregister.entity.AccountCreationEntity;
import in.userlogin.userregister.entity.ISDCodeEntity;
import in.userlogin.userregister.entity.IdEntity;
import in.userlogin.userregister.entity.OtpEntity;
import in.userlogin.userregister.entity.PhoneNumberEntity;
import in.userlogin.userregister.model.ISDCode;
import in.userlogin.userregister.model.OtpResponseDTO;
import in.userlogin.userregister.repositories.AccountCreationRepository;
import in.userlogin.userregister.repositories.ISDCodeRepository;
import in.userlogin.userregister.repositories.IdRepository;
import in.userlogin.userregister.repositories.OtpRepository;
import in.userlogin.userregister.repositories.PhoneNumberRepository;
@Service
public class UserRegisterService {

	@Autowired
	private ISDCodeRepository isdCodeRepository;

    @Autowired
    private IdRepository idRepository;
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private AccountCreationRepository accountCreationRepository;

    @Autowired
    private OtpRepository otpRepository;
public ApiResponse<OtpResponseDTO> registerUser(ISDCode isdCode, String phoneNo) {
    PhoneNumberEntity existingPhone = phoneNumberRepository.findByPhoneNo(phoneNo);
    if (existingPhone != null) {
        return new ApiResponse<>("Phone number already registered.", null);
    }

    // Create new user and OTP
    IdEntity id = idRepository.save(new IdEntity());

    ISDCodeEntity isdCodeEntity = new ISDCodeEntity();
    isdCodeEntity.setIsdCode(isdCode);
    isdCodeEntity.setUser(id);
    isdCodeRepository.save(isdCodeEntity);

    PhoneNumberEntity phoneEntity = new PhoneNumberEntity();
    phoneEntity.setPhoneNo(phoneNo);
    phoneEntity.setUser(id);
    phoneNumberRepository.save(phoneEntity);

    String otp = String.valueOf(100000 + new Random().nextInt(900000));
    OtpEntity otpEntity = new OtpEntity();
    otpEntity.setOtp(otp);
    otpEntity.setUser(id);
    otpRepository.save(otpEntity);

    AccountCreationEntity creationEntity = new AccountCreationEntity();
    creationEntity.setCreatedAt(LocalDateTime.now());
    creationEntity.setUser(id);
    accountCreationRepository.save(creationEntity);

    OtpResponseDTO responseDTO = new OtpResponseDTO(id.getUser_id(), phoneNo, otp);
    return new ApiResponse<>("OTP sent successfully.", responseDTO);
}
}