package RestAssuredAutomation.RestAssuredAutomationEmployeeDetails;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteRequest
{
	

    // This code is for Delete - "message": "successfully! deleted Records".
  
    
    @Test
	public void deleteRequest()
	{
		baseURI="http://dummy.restapiexample.com/api";
		
		when().
			delete("/v1/delete/2").
		   then().
			log().
			all();
	}
  

}
