package sonarcloud.module1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    @Test
    void equals_should_return_true_on_same_object() {
        SomeClass obj = new SomeClass("value");
        Assertions.assertEquals(obj, obj);
    }
}
