package api.authentication;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.authentication.UserObject;

import static utilities.LoadConfig.CONFIG;

public class PostLogin {
    public static final PostLogin LOGIN = getInstance();
    public static final String USER_TOKEN = LOGIN.getToken(UserObject.user());

    private static PostLogin getInstance() {
        return new PostLogin();
    }

    private PostLogin() {

    }

    private Response callAPI (UserObject user) {
        return RestAssured.given().contentType(ContentType.JSON)
                .body(user)
                .baseUri(CONFIG.getProperty("baseUrl")).basePath("api/users/login").post();
    }

    public String getToken(UserObject user) {
        Response res = callAPI(user);
        return res.path("token");
    }
}
