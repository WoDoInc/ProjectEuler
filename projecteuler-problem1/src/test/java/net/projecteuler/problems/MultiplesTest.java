package net.projecteuler.problems;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MultiplesTest {
    @Test
    public void findSumTest() {
        assertEquals(233168, Multiples.findSum(1000));
    }
}
