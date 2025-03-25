package com.API.models.response;

import java.util.List;

public class LoginResponse {

	private String token, type;
	private int id;
	private String username, password;
	private List<String> roles;
	public LoginResponse(String token, String type, int id, String username, String password, List<String> roles) {
		super();
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	
	public LoginResponse() {
		// TODO Auto-generated constructor stub
	}
	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
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


	@Override
	public String toString() {
		return "LoginResponse [token=" + token + ", type=" + type + ", id=" + id + ", username=" + username
				+ ", password=" + password + ", roles=" + roles + "]";
	}
	
	
}
