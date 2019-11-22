import java.io.* ;

class TwoLargestElements
{

  public static void main ( String[] args )  
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    int largest = data[0];
    int secondLargest = data[1];
    
    // compute the two largest
    for ( int index=0 ; index < data.length; index++)
    {
        if (largest < data[index])
        {
            largest = data[index];
        }
        else if (secondLargest < data[index])
        {
          secondLargest = data[index];
        }
    }
      
    // write out the two largest
    System.out.println("The largest number is: " + largest + " and the 2nd largest is: " + secondLargest);

  }
}     