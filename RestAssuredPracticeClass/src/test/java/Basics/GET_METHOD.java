package Basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;


public class GET_METHOD {
	@Test
	public void getmethod()
	{
		RestAssured.baseURI="https://reqres.in";
		
		Response response=given()
		
		.when()
		
		.get("/api/users?delay=3") //  /api/users?page=2   /api/users/2   /api/users?page=2   /api/users/23
		
		
		.then()
		.statusCode(200)
		.extract()
		.response();
		System.out.println(response);
  

		
		
	}

	

}
