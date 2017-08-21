package net.projecteuler.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A non-naive approach using Euclid's algorithm to find the greatest common divisor of two numbers;
 * it can be iterated to obtain the GCD and/or LCM of a larger set of numbers.
 * 
 * @author akaszczuk
 */
public class SmallestMultiple {
   private static final Logger LOGGER = LoggerFactory.getLogger(SmallestMultiple.class);
   /**
    * Finds the greatest common divisor of two numbers.
    * 
    * @param a First divisor.
    * @param b Second divisor.
    * 
    * @return Returns the GCD for the given pair.
    */
   private static int gcd(int a, int b) {
      while (b > 0) {
         int temp = b;
         b = a % b;
         a = temp;
      }
      return a;
   }

   /**
    * Finds the GCD of a given set of numbers.
    * (Read: An array of primitives instead of a set object.)
    * 
    * @param input The set of numbers to compare.
    * 
    * @return Returns the result of the GCD given a set.
    */
   public static int gcd(int[] input) {
      int result = input[0];
      for(int i = 1; i < input.length; i++) {
         result = gcd(result, input[i]);
      }

      return result;
   }

   /**
    * Finds the least common multiple of two numbers. 
    * 
    * @param a First factor.
    * @param b Second factor.
    * 
    * @return Returns the LCM of the given pair.
    */
   private static int lcm(int a, int b) {
      return a * (b / gcd(a, b));
   }

   /**
    * Finds the least common multiple of a set of numbers.
    * (Read: An array of primitives instead of a set object.)
    * 
    * @param input The set of numbers to find the LCM.
    * 
    * @return Returns the LCM of the given set.
    */
   public static int lcm(int[] input) {
      int result = input[0];
      for(int i = 1; i < input.length; i++) {
         result = lcm(result, input[i]);
      }

      LOGGER.info("Least common multiple set: {}", result);
      return result;
   }
}
