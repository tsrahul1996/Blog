package com.user.dto;

import java.util.Set;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class SignupRequest {
	
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
  

	private long primaryMobile;
	
	private String status;
    
    
}
