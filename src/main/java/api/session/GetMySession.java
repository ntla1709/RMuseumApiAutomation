package api.session;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetMySession {
    private Response callAPI(String token) {
        return RestAssured.given().contentType(ContentType.JSON)
                .header("Authorization", "bearer " + token)
                .get("api/users/login");
    }
    public Response GetSession(String token) {
        return callAPI(token);
    }
}
