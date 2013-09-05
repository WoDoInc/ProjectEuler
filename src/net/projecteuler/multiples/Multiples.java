package net.projecteuler.multiples;

/**
 * Project Euler Problem #1.
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author akaszczuk
 *
 */

public class Multiples
{
   /**
    * Finds whether the number provided is a multiple of 3 or 5.
    * 
    * @param multiple The multiple to inspect.
    * @return Returns the multiple if indeed is a multiple of 3 or 5, otherwise returns 0.
    */
   static int findMultiple(int multiple)
   {
      if (multiple % 3 == 0)
      {
         return multiple;
      }
      else if (multiple % 5 == 0)
      {
         return multiple;
      }
      
      return 0;
   }
   
   /**
    * Finds the sum of all multiples up to the specified number.
    * 
    * @param finalNumber The number to iterate towards.
    * @return Returns the final result/summation of all multiples to the nth number.
    */
   static int findSum(int finalNumber)
   {
      int result = 0;
      
      for (int i = 1; i < finalNumber; i++)
      {
         result += findMultiple(i);
      }
      
      return result;
   }
   
   /**
    * @param args
    */
   public static void main(String[] args)
   {
      // Find the sum of the multiples in all numbers up to 1000.
      System.out.println("The sum is the following: " + findSum(1000));
   }
}
