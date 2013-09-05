package net.projecteulet.largestprimefactor;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 * 
 * There is also a theReq problem which involves printing out all the prime numbers between 1 to 100.
 * Create a subset method to solve this problem as well.
 * 
 * @author akaszczuk
 *
 */

public class LargestPrimeFactor
{
   public static int largestPrimeFactor(long number)
   {
      int i;
      for (i = 2; i <= number; i++)
      {
         System.out.println("Incremented: " + i);
         if (number % i == 0)
         {
            number /= i;
            i--;
            System.out.println("Decremented: " + i);
         }
         System.out.println("Skipped: " + i);
      }
          
      return i;
   }

   /**
    * @param args
    */
   public static void main(String[] args)
   {
      System.out.println(largestPrimeFactor(600851475143l));
   }
}
