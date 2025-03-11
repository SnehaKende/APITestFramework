package com.API.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.API.models.request.LoginRequest;
import com.API.models.response.LoginResponse;
import com.API.services.AuthServices;

import io.restassured.response.Response;

public class LoginTest {

	@Test(description = "Verify if Login API is working..")
	public void Login() {
		
		LoginRequest loginReq = new LoginRequest("uday1234", "uday1234");
		AuthServices authService = new AuthServices();
		Response response = authService.Login(loginReq);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getType());
		
		Assert.assertTrue(loginResponse.getToken() != null);
	}
}
