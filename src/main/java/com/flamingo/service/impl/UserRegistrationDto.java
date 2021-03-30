
package com.flamingo.service.impl;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserRegistrationDto {

	@NotEmpty
	private String firstname;

	@NotEmpty
	private String lastname;

	@NotEmpty
	private String password;

	@NotEmpty
	private String username;

	@Email
	@NotEmpty
	private String email;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
