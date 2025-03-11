package com.API.services;

import com.API.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private static final String BASE_URI = "http://64.227.160.186:8080/";
	 private RequestSpecification requestSpec;

	    public BaseService() {
	        this.requestSpec = RestAssured.given()
	            .baseUri(BASE_URI);
	           
	    }
	    
	    protected Response postRequest(Object loginReq, String endPoint) {
	    	return requestSpec.contentType(ContentType.JSON).body(loginReq).post(endPoint);
	    }
}
