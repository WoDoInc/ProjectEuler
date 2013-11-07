package net.projecteuler.palindrome;

public class Palindrome
{
   /**
    * Complete naive brute force to find the largest palindrome given two factors containing three digits. Small
    * optimizations regarding the scope of the problem.
    * 
    * A palindrome can be written as: abccba
    * 
    * Which then simpifies to:
    * 100000a + 10000b + 1000c + 100c + 10b + a
    * 
    * And then:
    * 100001a + 10010b + 1100c
    * 
    * Factoring out 11, you get:
    * 11(9091a + 910b + 100c)
    * 
    * So the palindrome must be divisible by 11. Seeing as 11 is prime, at least one of the numbers must be
    * divisible by 11.
    * 
    * @return returns the largest palindrome as a primitive integer.
    */
   public static int findLargestPalindrome()
   {
      int maximum = 0;
      
      for (int largestTripleDigit = 999; largestTripleDigit > 99; largestTripleDigit--)
      {
         for (int factor = 990; factor > 99; factor-=11)
         {
            final int product = factor * largestTripleDigit;
            final String potentialPalindrome = String.valueOf(product);
            
            if (isPalindrome(potentialPalindrome))
            {
               maximum = product > maximum ? product : maximum;
            }
         }
      }
      
      return maximum;
   }

   /**
    * Determines if the given string is a palindrome.
    * 
    * @param potentialPalindrome The string to validate.
    * @return Returns true if a palindrome is found, false otherwise.
    */
   private static boolean isPalindrome(String potentialPalindrome)
   {
      final int length = potentialPalindrome.length();
      boolean isPalindrome = true;
      
      for (int i = 0; i < length / 2; i++)
      {
         if (potentialPalindrome.charAt(i) != potentialPalindrome.charAt(length-i-1))
         {
            isPalindrome = false;
            break;
         }
      }
      
      return isPalindrome;
   }
   
   /**
    * Main method.
    * 
    * @param args Unused.
    */
   public static void main(String[] args)
   {
      System.out.println("Largest palindrome with three digit factors: " + Palindrome.findLargestPalindrome());
   }
}
