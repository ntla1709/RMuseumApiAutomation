package utilities;

public enum AppProperty {

    BASE_URL("baseUrl"),
    USER_NAME("username"),
    PASS_WORD("password");

    private final String key;

    AppProperty(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
