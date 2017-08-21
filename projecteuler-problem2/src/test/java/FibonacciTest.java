import java.math.BigInteger;

import net.projecteuler.fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void calculateFibonacciSequenceTest() {
        final BigInteger finalResult = Fibonacci.calculateFibonacciSequence(BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(4000000));
        assertEquals(new BigInteger("4613732"), finalResult);
    }
}
