package net.projecteuler.sumsquaredifference;

import java.math.BigInteger;

public class SquareSumDifference
{
   public static BigInteger findDifference()
   {
      BigInteger sumOfSquares = BigInteger.ZERO;
      BigInteger squareOfSums = BigInteger.ZERO;
      
      for (int i = 1; i <= 100; i++)
      {
         BigInteger squared = BigInteger.valueOf(i);
         squared = squared.multiply(BigInteger.valueOf(i));
         sumOfSquares = sumOfSquares.add(squared);
         squareOfSums = squareOfSums.add(BigInteger.valueOf(i));
      }
      squareOfSums = squareOfSums.multiply(squareOfSums);
      System.out.println("Square of Sums: " + squareOfSums.toString());
      System.out.println("Sum of Squares: " + sumOfSquares.toString());
      
      return squareOfSums.subtract(sumOfSquares);
   }
   
   /**
    * @param args
    */
   public static void main(String[] args)
   {
      System.out.println("The Difference between the Square of Sums and Sum of Squares is: " + SquareSumDifference.findDifference().toString());
   }
}
