package net.projecteuler.palindrome;

public class Palindrome
{

   /**
    * Complete naive brute force to find the largest palindrome given two factors containing three digits.
    * 
    * @return returns the largest palindrome as a primitive integer.
    */
   public int findLargestPalindrome()
   {
      int maximum = 0;
      
      for (int largestTripleDigit = 999; largestTripleDigit > 99; largestTripleDigit--)
      {
         for (int factor = largestTripleDigit; factor > 99; factor--)
         {
            final int product = factor * largestTripleDigit;
            final String potentialPalindrome = String.valueOf(product);
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
            
            if (isPalindrome)
            {
               maximum = product > maximum ? product : maximum;
            }
         }
      }
      
      return maximum;
   }

   /**
    * Main method.
    * 
    * @param args Unused.
    */
   public static void main(String[] args)
   {
      Palindrome palindromeTest = new Palindrome();
      int palindrome = palindromeTest.findLargestPalindrome();
      
      System.out.println("Largest palindrome with three digit factors: " + palindrome);
   }
}
