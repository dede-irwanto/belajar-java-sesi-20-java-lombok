package programmerzamannow.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MemberTest {
    @Test
    void testCosntructorNull() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            var member = new Member(null, null);
        });
    }
    @Test
    void testSetterNull() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            var member = new Member("Dede", "Dede");
            member.setName(null);
        });
    }

    @Test
    void testMethodNull() {
        Assertions.assertThrows(NullPointerException.class, ()->{
            var member = new Member("Dede", "Dede");
            member.sayHello(null);
        });
    }
}
