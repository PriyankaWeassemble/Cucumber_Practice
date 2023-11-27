package Basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;//create this static import
import io.restassured.response.Response;

public class POST_METHOD {
	@Test(enabled = false)
	public void postmethodbasicexample()
	{
		RestAssured.baseURI="https://reqres.in/api";
		Response repo=given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"morpheus\",\r\n"
						+ "    \"job\": \"leader\"\r\n"
						+ "}")
				
				.when()
				.post("/api/users")
				
				.then()
				.extract()
				.response();
		
				String value=repo.asPrettyString();
	        	System.out.println(value);
		
	}

// API KEY POSTMAN-->PMAK-65068b28caef6204adca32e8-2a95d10ac2bf0b0ec4d8c6628e273f8dd0
 @Test
 public void getthecreateduser()
 {
	 RestAssured.baseURI="https://reqres.in/api";
	 Response repo=given()
			.when()
.get("/340")
.then()
.extract()
.response();

String value=repo.asPrettyString();
System.out.println(value);

 
 
 }
}