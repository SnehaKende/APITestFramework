package com.API.tests;

import org.testng.annotations.Test;

import com.API.services.AuthServices;

import io.restassured.response.Response;

public class LoginTest {

	@Test(description = "Verify if Login API is working..")
	public void Login() {
		
		AuthServices authService = new AuthServices();
		Response loginResponse = authService.Login("{\r\n"
				+ "  \"username\": \"uday1234\",\r\n"
				+ "  \"password\": \"uday1234\"\r\n"
				+ "}");
		System.out.println(loginResponse.asPrettyString());
	}
}
