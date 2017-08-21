package net.projecteuler.problems;

import java.math.BigInteger;

public class SquareSumDifference {
   /**
    * Finds the difference for the square of sums and sum of squares.
    * 
    * @return Returns the difference.
    */
   public static BigInteger findDifference() {
      BigInteger sumOfSquares = BigInteger.ZERO;
      BigInteger squareOfSums = BigInteger.ZERO;

      for (int i = 1; i <= 100; i++) {
         BigInteger squared = BigInteger.valueOf(i);
         squared = squared.multiply(BigInteger.valueOf(i));
         sumOfSquares = sumOfSquares.add(squared);
         squareOfSums = squareOfSums.add(BigInteger.valueOf(i));
      }
      squareOfSums = squareOfSums.multiply(squareOfSums);

      return squareOfSums.subtract(sumOfSquares);
   }
}
