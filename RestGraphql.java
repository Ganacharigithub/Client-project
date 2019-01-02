package com.project.sample;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseBuilder;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestGraphql {
	
	Header requestHeader = new Header("Content-type", "application/json");
	String requestPayload="{\"operationName\":null,\"variables\":{},\"query\":\"{\\n  allPersons(last: 2) {\\n    name\\n  }\\n}\\n\"}";
	String url="https://api.graph.cool/simple/v1/cjp9wx4a14xr9013081egis05/";

	@Test
	public void getStatusCodeTest() {
		
		 Header requestHeader = new Header("Content-type", "application/json");
		String requestPayload="{\"operationName\":null,\"variables\":{},\"query\":\"{\\n  allPersons(last: 2) {\\n    name\\n  }\\n}\\n\"}";
		String url="https://api.graph.cool/simple/v1/cjp9wx4a14xr9013081egis05/";
		String code=RestAssured.given()
				.header(requestHeader)
				.body(requestPayload).when().post(url).getStatusLine();
		
		System.out.println("Status code is " +code);
//				.then().
//				.assertThat().statusCode(200);
	
}
	@Test
	public void getPersonDetails() {
		
		 
		String Response=RestAssured.given()
					.header(requestHeader)
					.body(requestPayload).when().post(url).getBody().asString();
		System.out.println("Rspone Body is:"+Response);
		
		
	}
		
		@Test
	public void getHeaderTest() {
		// TODO Auto-generated method stub
			
		String contentType=RestAssured.given()
				.header(requestHeader)
				.body(requestPayload).when().post(url).header("Content-Type");
	System.out.println("Content Type Value is:" +contentType);
	
	}
		
		@Test
		public void getDetais() {
			RequestSpecification httpRequest=RestAssured.given();
			Response response=httpRequest.post(url);

			JsonPath jsonPathEvaluator=response.jsonPath();
			String name=jsonPathEvaluator.get("name");
			System.out.println("Name is : " +name);
//			String serverType=response.header("Server");
//			System.out.println("Server value is:" +serverType);
//			String acceptLanguage=response.header("Content-Encoding");
//			System.out.println("Content-Encoding :" +acceptLanguage);
//			Headers allHeaders=response.headers();
//			for(Header header:allHeaders)
//			{
//			System.out.println("Key: " +header.getName() + "Value:" +header.getValue());
		}

	
		
}

