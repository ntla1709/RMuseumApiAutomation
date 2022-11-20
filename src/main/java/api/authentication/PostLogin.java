package api.authentication;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.authentication.UserObject;

public class PostLogin {
    public static final PostLogin LOGIN = getInstance();
   // public static final String USER_TOKEN =

    private static PostLogin getInstance() {
        return new PostLogin();
    }

    private PostLogin() {

    }

    private Response callAPI (UserObject user) {
        return RestAssured.given().contentType(ContentType.JSON)
                .body(user)
                .baseUri("https://api.ganjoor.net").basePath("api/users/login").post();
    }
}
