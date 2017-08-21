package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeFactorTest {
    @Test
    public void largestPrimeFactorTest() {
        assertEquals(6857L, LargestPrimeFactor.largestPrimeFactor(600851475143l));
    }
}
