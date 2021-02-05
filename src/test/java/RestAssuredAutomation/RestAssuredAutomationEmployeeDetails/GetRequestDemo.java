package RestAssuredAutomation.RestAssuredAutomationEmployeeDetails;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;


public class GetRequestDemo 
{
	

		// This code is for  Get - Status code to be Successful.	  
		 @Test
			public void getRequest()
			{
				Response response = get("http://dummy.restapiexample.com/api/v1/employees");
				System.out.println("Response Content type -->  :" +response.header("content-type"));
				System.out.println("Response Content type -->  :" +response.getContentType());
				System.out.println("Response StatusCode   -->  :" +response.statusCode());
				System.out.println("Response StatusLine    -->  :" +response.statusLine());
				System.out.println("Response getBody        --> :"+response.getBody().asString());
			
				//Assertion
				int Statuscode=response.getStatusCode();
				Assert.assertEquals(Statuscode, 200);
				
			}
			
			
		  
		
		  
			
		  
		  
		  
		 	
		
		
	

}
