package net.projecteuler.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {
    @Test
    public void largestPrimeFactorTest() {
        assertEquals(6857L, LargestPrimeFactor.largestPrimeFactor(600851475143l));
    }
}
