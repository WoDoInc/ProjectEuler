package net.projecteuler.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {
    @Test
    public void findLargestPalindromeTest() {
        assertEquals(6857L, Palindrome.findLargestPalindrome());
    }
}
