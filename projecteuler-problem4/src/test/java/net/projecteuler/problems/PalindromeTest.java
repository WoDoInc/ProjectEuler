package net.projecteuler.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    @Test
    public void findLargestPalindromeTest() {
        assertEquals(906609, Palindrome.findLargestPalindrome());
    }
}
