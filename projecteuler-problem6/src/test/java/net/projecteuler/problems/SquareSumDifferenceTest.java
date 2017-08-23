package net.projecteuler.problems;

import java.math.BigInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSumDifferenceTest {
    @Test
    public void findDifferenceTest() {
        final BigInteger result = SquareSumDifference.findDifference();

        System.out.println("The Difference between the Square of Sums and Sum of Squares is: " + result.toString());
        assertEquals(new BigInteger("25164150"), result);
    }
}
