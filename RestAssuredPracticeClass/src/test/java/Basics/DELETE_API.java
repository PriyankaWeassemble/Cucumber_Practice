package Basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_API {
	
	
	//POST(Create) workspaces
			@Test (enabled=false)
			public void createallworkspaces()
			{
				RestAssured.baseURI="https://api.getpostman.com";
				Response response=given()
						.header("x-api-key","PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0")
						.header("content-type","application/json")
						.body("{\r\n"
								+ "    \"workspace\": {\r\n"
								+ "        \"name\": \"Test API for delete method\",\r\n"
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
						
						
			}
			//OUTPUT-->{ "workspace": {"id": "adf39ef0-61f7-4997-ae15-3e159385069e",
//		        "name": "Test API for delete method"}
		    
			
			@Test
			public void deleteworkspace()
			{
				RestAssured.baseURI="https://api.getpostman.com";
				Response repo=given()
						.header("x-api-key","PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0")
						.when()
						.delete("/workspaces/adf39ef0-61f7-4997-ae15-3e159385069e")
						.then()
						.extract()
						.response();
				String value=repo.asPrettyString();
				System.out.println(value);
					System.out.println(repo.getStatusCode());
					System.out.println(repo.getStatusLine());
					System.out.println(repo.getTime());
					
					
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}






	
