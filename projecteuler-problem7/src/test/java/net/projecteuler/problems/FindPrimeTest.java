package net.projecteuler.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindPrimeTest {
    @Test
    public void largestPrimeTest() {
        final int result = FindPrime.nthPrime(10001);

        System.out.println("10001st prime is: " + result);
        assertEquals(104743, result);
    }
}
