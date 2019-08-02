package com.github.binarySmile.petstoreswagger;

import com.github.binarySmile.petstoreswagger.common.Constants;
import com.github.binarySmile.petstoreswagger.pojo.InventoryResponse;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class TestSuite extends Constants {

 @Test
    public void createUserTest() {
        Map <String, String> user = new HashMap <String, String>();
        user.put("id", ID_USER);
        user.put("username", USER_NAME);
        user.put("firstName", FIRST_NAME);
        user.put("lastName", LAST_NAME);
        user.put("email", EMAIL);
        user.put("password", PASSWORD);
        user.put("phone", PHONE);
        user.put("status", USER_STATUS);

        given()
                .baseUri(BASE_URI)
                .basePath(BASE_PATH_USER)
                .contentType(ContentType.JSON)
                .body(user)
                .when().post()
                .then().statusCode(200);
        System.out.println("Test 1 done");
    }

@Test
    public void inventoryTest() {
        InventoryResponse response = given()
                .get(BASE_URI + BASE_PATH_INVENTORY)
                .body()
                .as(InventoryResponse.class);
        System.out.println(response);
    }
}
