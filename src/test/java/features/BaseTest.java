package features;

import api.authentication.PostLogin;
import org.junit.jupiter.api.Test;

public class BaseTest {
    @Test
    void test1() {
        System.out.println(PostLogin.USER_TOKEN);
    }
}
