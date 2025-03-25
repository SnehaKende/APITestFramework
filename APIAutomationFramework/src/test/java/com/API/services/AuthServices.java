package com.API.services;

import com.API.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthServices extends BaseService{
	
	private static final String AUTH_PATH = "/api/auth/";

	
	public Response Login(LoginRequest loginReq) {
	
		return postRequest(loginReq, AUTH_PATH + "/login");	
	}
}
