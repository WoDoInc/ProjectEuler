package net.projecteuler.smallestmultiple;

public class SmallestMultiple
{
      /**
       * Main Method.
       * 
       * @param args
       */
      public static void main(String[] args) {
           
          boolean complete = false;
          int theCount = 0;
          int divisor = 1;
           
          do
          {
              theCount++;
              for(divisor = 1; divisor <= 20; divisor ++)
              {
                  if (theCount % divisor != 0)
                  {
                      break;
                  }
                  else if (theCount % divisor == 0 && divisor == 20){
                      complete = true;
                  }
              }           
               
          } while(!complete);
   
          System.out.println("Lowest number evenly divisible by numbers 1 to 20 is " + theCount);
      }
}
