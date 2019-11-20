import java.io.* ;

public class SumOfEvenOddAndAllElements
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums

    int sumEven = 0;
    int sumOdd = 0;
    int sumAll = 0;

    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
        if (data[index] % 2 == 0)
        {
            sumEven += data[index];
        }
        else
        {
            sumOdd += data[index];
        }

        sumAll += data[index];
    }
      
    // write out the three sums
    System.out.println("The sum of the even numbers is: " + sumEven);
    System.out.println("The sum of the odd numbers is:  " + sumOdd);
    System.out.println("The sum of the all numbers is:  " + sumAll);

  }
}     