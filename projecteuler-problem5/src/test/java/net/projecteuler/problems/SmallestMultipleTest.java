package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestMultipleTest {
    @Test
    public void lcmTest() {
        final int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        assertEquals(6857L, SmallestMultiple.lcm(numbers));
    }
}
