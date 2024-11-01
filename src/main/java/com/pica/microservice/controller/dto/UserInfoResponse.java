package com.pica.microservice.controller.dto;

import java.util.Set;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfoResponse {

	private Long id;

	private String username;

	@Email
	private String email;

	private Set<String> roles;
}
