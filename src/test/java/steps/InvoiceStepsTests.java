package steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class InvoiceStepsTests {

    RequestSpecification request;
    Response response;
    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJleHAiOjE3MjE5MjE4MTgsImlhdCI6MTcxOTMyOTgxOCwidXNlcm5hbWUiOiJxYXRlc3RlckBnbWFpbC5jb20ifQ.fv8GVvDXSsaJ-VZTQHjXem6QcqWI5gerLvuDAsRPShkF8Xnu7pkSJF4hUp7W70sB6-JeJQu_Bo8OuFxyBWhYew";
    JSONObject requestBody = new JSONObject();


    @Test
    public void method1(){
        System.out.println("THIS IS METHOD FROM INVOICE TESTS CLASS");
    }


}
