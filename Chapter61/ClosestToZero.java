import java.io.* ;
import java.lang.Math;

class ClosestToZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int closestToZero = data[0];
    
    
    // find the element nearest to zero
    for (int number : data)
    {
        if (Math.abs(number) < closestToZero)
        {
            closestToZero = number;
        }
    }
      
    // write out the element nearest to zero
    System.out.println( "The number which just ever so happens to be the closest to zero is: " + closestToZero );

  }
}    