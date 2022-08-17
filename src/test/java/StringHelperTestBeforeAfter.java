 import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTestBeforeAfter {

    @BeforeAll
    public static void setup() {
        System.out.println("Before");
    }

    @Test
    public void test() {
        System.out.println("Code");
    }

    @Test
    public void test2() {
        System.out.println("Code");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After");
    }

}