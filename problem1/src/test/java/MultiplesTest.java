import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesTest {
    @Test
    public void testFindSum() {
        assertEquals(233168, Multiples.findSum(1000));
    }
}
