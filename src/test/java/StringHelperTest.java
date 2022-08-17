import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

    @Test
    public void test() {
        StringHelper helper = new StringHelper();
        assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
    }


}