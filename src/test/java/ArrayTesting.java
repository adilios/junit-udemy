import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {

    @Test
    public void testArraySort() {
        int[] numbers = {1, 2, 9, 6, 5};
        int[] expected = {1, 2, 5, 6, 9};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testArraySortNull() {
        int[] numbers = null;
        int[] expected = {1, 2, 5, 6, 9};

        try {
            Arrays.sort(numbers);
            assertArrayEquals(expected, numbers);
        } catch (NullPointerException e) {
            System.out.println("O array não pode ser nulo");
        }
    }

    @Test
    @Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
    public void testArraySortPerfomance() {
        int[] numbers = {1, 2, 9, 6, 5};
        for(int i=0; i < 1000000; i++ ) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }

}