package models.authentication;

import lombok.Data;

@Data
public class UserObject {
    private String username;
    private String password;
    private String clientAppName;
    private String language;

    public UserObject(String username, String password, String clientAppName, String language) {
        this.username = username;
        this.password = password;
        this.clientAppName = clientAppName;
        this.language = language;
    }

    public static UserObject user() {
        return new UserObject("naren98997@lidely.com", "123qweQWE", "string", "english");
    }
}

