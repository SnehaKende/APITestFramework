package com.API.services;

import io.restassured.response.Response;

public class AuthServices extends BaseService{
	
	private static final String AUTH_PATH = "/api/auth/";

	public Response Login(String payLoad) {
	
		return postRequest(payLoad, AUTH_PATH + "/login");	
	}
}
