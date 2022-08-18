import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class ParameterBool {

    StringHelper helper = new StringHelper();

    private String input;
    private Boolean expectedOutput;

    public ParameterBool(String input, Boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Object[] testConditions() {
        return new Object[][] {
            {
                "AACDAA", true
            },
            {
                "ACD", false
            }
        } ;

    }

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(expectedOutput,
                helper.areFirstAndLastTwoCharactersTheSame(input));
    }


}
