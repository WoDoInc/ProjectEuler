package net.projecteuler.problems;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void calculateFibonacciSequenceTest() {
        final BigInteger finalResult = Fibonacci.calculateFibonacciSequence(BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(4000000));
        assertEquals(new BigInteger("4613732"), finalResult);
    }
}
