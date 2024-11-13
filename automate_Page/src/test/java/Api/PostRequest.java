package Api;
import java.net.*;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import java.io.*;


public class PostRequest {
	
	public static  void UserRegistrationSuccessful() 
	{ 
	    RestAssured.baseURI ="https://demoqa.com/Account/v1"; 
	    RequestSpecification request = RestAssured.given(); 
	    JSONObject requestParams = new JSONObject();
	    requestParams.put("UserName", "test_rest");
	    requestParams.put("Password", "Testrest@123"); 
	    request.body(requestParams.toJSONString());
	    Response response = request.post("/User"); 
	    ResponseBody body = response.getBody();
	    System.out.println(body.asString());
	    Assert.assertEquals(response.getStatusCode(), 400,"Error Code doesn't match");
	}
	
	public static void main(String[] args) {
		UserRegistrationSuccessful();
	}
}