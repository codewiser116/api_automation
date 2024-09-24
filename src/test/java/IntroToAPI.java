import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.List;
public class IntroToAPI {


    public static void main(String[] args) {
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .auth()
                .oauth2("token")
                .baseUri("https://backend.cashwise.us/api")
                .when()
                .get("/myaccount/products");

        Assert.assertEquals(response.statusCode(), 200);

//                .body("product_title", equalTo("Lagman"))
//                .body("product_price", equalTo(32));
    }









// ANNA START TYPING
    public static int maxSum(List<Integer> ar) {
        int n = ar.size();

        // i will check if size is zero, then right away zero
        // also if size is 1, return itself
        if (n == 0) return 0;
        if (n == 1) return ar.get(0);

        /*
        i will create array of int
        and manually assign values, first 2 values

        it will help me to compare numbers

        I WILL ADD FIRST 2 NUMBERSM COMPARE THEM

        THEN OTHERS I WILL ADD INSIDE THE LOOP



       LET ME CODE THIS FIRST QUICKLY


         */
        int[] ar2 = new int[n];
        ar2[0] = ar.get(0);
        ar2[1] = Math.max(ar.get(0), ar.get(1));

        for (int i = 2; i < n; i++) {
            ar2[i] = Math.max(ar2[i - 1], ar2[i - 2] + ar.get(i));

        }

        return ar2[n - 1];
    }




}
