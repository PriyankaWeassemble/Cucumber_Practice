package Basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PUT_Method {
	// API KEY POSTMAN-->PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0
	
	
	//POST(Create) workspaces
		@Test //(enabled=false)
		public void createallworkspaces()
		{
			RestAssured.baseURI="https://api.getpostman.com";
			Response response=given()
					.header("x-api-key","PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0")
					.header("content-type","application/json")
					.body("{\r\n"
							+ "    \"workspace\": {\r\n"
							+ "        \"name\": \"Test API again\",\r\n"
							+ "        \"type\": \"personal\",\r\n"
							+ "        \"description\": \"justtest\"\r\n"
							+ "    }\r\n"
							+ "}")
					.when()
					.post("/workspaces")
					.then()
					.extract()
					.response();
			String value=response.asPrettyString();
			System.out.println(value);
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getTime());
					
		}
	
	
	
	//GET all workspaces
	@Test     (enabled=false)
	public void getallworkspaces()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		Response response=given()
				.header("x-api-key","PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0")
				.when()
				.get("/workspaces")
				.then()
				.extract()
				.response();
		String value=response.asPrettyString();
		System.out.println(value);
				
				
	}
	
	
	
	@Test    (enabled=false)
	public void updateworkspace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		Response repo=given()
				.header("Content-Type","application/json")
				.header("x-api-key","PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0")
				.body("{\r\n"
						+ "    \"workspace\": {\r\n"
						+ "        \"name\": \"Test API updated\",\r\n"
						+ "        \"type\": \"personal\",\r\n"
						+ "        \"description\": \"justtest the updated one by PUT method\"\r\n"
						+ "    }\r\n"
						+ "}")
				.when()
				.put("/workspaces/3c8d4155-cba0-4a13-8796-ffd477a735a7")
				.then()
				.extract()
				.response();
		String value=repo.asPrettyString();
		System.out.println(value);
				
		
	}

}
