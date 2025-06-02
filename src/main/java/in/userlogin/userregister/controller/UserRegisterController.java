package in.userlogin.userregister.controller;

import in.userlogin.userregister.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.userlogin.userregister.model.OtpResponseDTO;
import in.userlogin.userregister.model.PhoneRequestDTO;
import in.userlogin.userregister.service.UserRegisterService;

@RestController
@RequestMapping("/api/v1/auth")
public class UserRegisterController {

	@Autowired
	private UserRegisterService userService;

	@PostMapping("/register")
	public ResponseEntity<ApiResponse<OtpResponseDTO>> register(@RequestBody PhoneRequestDTO request) {
		ApiResponse<OtpResponseDTO> response = userService.registerUser(request.getIsdcode(), request.getPhoneNo());
		return ResponseEntity.ok(response);
	}
}