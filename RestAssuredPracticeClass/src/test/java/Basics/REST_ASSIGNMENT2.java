package Basics;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class REST_ASSIGNMENT2 {
	
	@Test
	public void fetchdatafromJson()
	{
		String json="{\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\"website\": \"www.abc.com\"\r\n"
				+ "},\r\n"
				+ "\"courses\": [\r\n"
				+ "{\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\"price\": 50,\r\n"
				+ "\"copies\": 6\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\"price\": 40,\r\n"
				+ "\"copies\": 4\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\"price\": 45,\r\n"
				+ "\"copies\": 10\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "";
		
		JsonPath jp=new JsonPath(json);
		
		
//		1. Print No of courses returned by API
		Integer coures_size=jp.getInt("courses.size()");
		System.out.println("1st question answer is = "+coures_size);
		
//		2. Print Purchase Amount
		Integer dashboard_purchaseAmount= jp.getInt("dashboard.purchaseAmount");
		System.out.println("2 nd question answer is = "+dashboard_purchaseAmount);
		
//		3. Print Title of the first course
		System.out.println("3 rd question answer is = "+jp.getString("courses[0].title"));
		
		
//		4. Print all course titles and their respective Prices
		System.out.println("4th question answer");
		
		String course1_title=jp.getString("courses[0].title");
		Integer course1_prices=jp.getInt("courses[0].price");
		
	
		System.out.println(course1_title);
		System.out.println(course1_prices);
		
		String course2_title=jp.getString("courses[1].title");
		Integer course2_prices=jp.getInt("courses[1].price");
		System.out.println(course2_title);
		System.out.println(course2_prices);
		
		
		String course3_title=jp.getString("courses[2].title");
		Integer course3_prices=jp.getInt("courses[2].price");
		System.out.println(course3_title);
		System.out.println(course3_prices);
		
	
//		for(int i=0;i<=coures_size;i++)
//		{
//			System.out.println(jp.getString("courses[i].title"));
//			System.out.println(jp.getInt("courses[i].price"));
//		}
		
//		5. Print no of copies sold by RPA Course
		System.out.println("5th question answer");
		
		Integer course3_copies=jp.getInt("courses[2].copies");
		Integer RPA_COPIES_SOLD=(course3_prices*course3_copies);
		System.out.println("NO. of copies sold by RPA is ="+RPA_COPIES_SOLD);
//		6. Verify if Sum of all Course prices matches with Purchase Amount
		System.out.println("6th question answer");
		Integer course1_copies=jp.getInt("courses[0].copies");
		Integer course2_copies=jp.getInt("courses[1].copies");
		
	
		Integer Selenium_Python_COPIES_SOLD=(course1_copies*course1_prices);
		Integer Cypress_COPIES_SOLD=(course2_prices*course2_copies);
	
		Integer Total_Amount_BY_Calculation=(Selenium_Python_COPIES_SOLD+Cypress_COPIES_SOLD+RPA_COPIES_SOLD);
		
		
		Assert.assertEquals(dashboard_purchaseAmount, Total_Amount_BY_Calculation);
		System.out.println(" Sum of all Course prices matches with Purchase Amount");
		
		
		
		
	}

}
