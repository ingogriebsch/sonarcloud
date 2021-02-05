package sonarcloud.module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SomeClassTest {

    @Test
    void equals_should_return_true_on_same_object() {
        SomeClass obj = new SomeClass("value");
        Assertions.assertEquals(obj, obj);
    }

    @Test
    void equals_should_return_false_on_same_object_with_different_value() {
        SomeClass obj1 = new SomeClass("value1");
        SomeClass obj2 = new SomeClass("value2");
        Assertions.assertNotEquals(obj1, obj2);
    }

    @Test
    void equals_should_return_false_on_different_tyoe() {
        String value = "value1";
        SomeClass obj1 = new SomeClass(value);
        Assertions.assertNotEquals(obj1, new String(value));
    }

    @Test
    void get_should_return_set_value() {
        String value = "value";
        SomeClass obj = new SomeClass(value);
        Assertions.assertEquals(obj.getValue(), value);
    }

    @Test
    void set_should_change_value() {
        String value = "value1";
        SomeClass obj = new SomeClass(value);
        Assertions.assertEquals(obj.getValue(), value);
        value = "value2";
        obj.setValue(value);
        Assertions.assertEquals(obj.getValue(), value);
    }

    @Test
    void toString_should_return_string_containing_value() {
        String value = "value1";
        SomeClass obj = new SomeClass(value);
        Assertions.assertEquals(obj.toString(), "SomeClass [value=" + value + "]");
    }
}
