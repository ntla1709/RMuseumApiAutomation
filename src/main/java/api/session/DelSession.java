package api.session;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DelSession {
    private Response callAPI(String token) {
        return RestAssured.given().contentType(ContentType.JSON)
                .header("Authorization", "bearer " + token)
                .get("api/users/login");
    }
}
