package Basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class REST_ASSIGNMENT_1 {
//	Assignment: WAP to print the lastname of a person whose id is 9
		@Test     
		public void getallworkspaces()
		{
			RestAssured.baseURI="https://reqres.in/api";
			Response response=given()
					
					.when()
					.get("/users?page=2")
					.then()
					.extract()
					.response();
//			String value=response.asPrettyString();
//			System.out.println(value);
			
		 JsonPath jp = response.jsonPath();
				System.out.println(jp.getString("data[3].last_name"));
					
		}

}
