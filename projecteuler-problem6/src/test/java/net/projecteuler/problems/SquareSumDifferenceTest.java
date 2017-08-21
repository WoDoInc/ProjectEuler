package net.projecteuler.problems;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareSumDifferenceTest {
    Logger LOGGER = LoggerFactory.getLogger(SquareSumDifference.class);
    @Test
    public void largestPrimeFactorTest() {
        final BigInteger result = SquareSumDifference.findDifference();

        LOGGER.info("The Difference between the Square of Sums and Sum of Squares is: {}", result);
        assertEquals(6857L, result);
    }
}
