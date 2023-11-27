package programmerzamannow.lombok;

import lombok.*;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class LoginTest {

    @Test
    void testCreate() {
        var login1 = Login.crateEmpty();
        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());

        var login2 = Login.create("dede", "rahasia");
        Assertions.assertEquals("dede", login2.getUsername());
        Assertions.assertEquals("rahasia", login2.getPassword());
    }

    @Test
    void testToString() {
        var login = Login.create("dede","rahasia");
        System.out.println(login);
    }
}
