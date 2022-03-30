package com.yudhi.usermanagement.payload;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class SignupRequest {

	@NotBlank
	private String fullname;
	@NotBlank
	private String username;
	@NotBlank
	private String email;
	@NotBlank
	private String password;
	private List<String> roles;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
