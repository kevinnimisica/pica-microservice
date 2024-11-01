package com.pica.microservice.controller.dto;

import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class SignUpRequest {

	@Email
	private String email;

	private String username;

	private String password;

	@Nullable
	private List<String> role;

}
