import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void truncateAInFirst2Positions_oneA() {
        assertEquals("BC", helper.truncateAInFirst2Positions("ABC"));
    }

    @Test
    public void truncateAInFirst2Positions_twoA() {
        assertEquals("BC", helper.truncateAInFirst2Positions("AABC"));
    }
    @Test
    public void firstAndSecondCharsEquals_false() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("GRAY"));
    }
    @Test
    public void firstAndSecondCharsEquals_true() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("GRaGR"));
    }


}