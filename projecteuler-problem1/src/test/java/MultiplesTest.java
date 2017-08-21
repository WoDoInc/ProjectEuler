import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesTest {
    @Test
    public void findSumTest() {
        assertEquals(233168, Multiples.findSum(1000));
    }
}
