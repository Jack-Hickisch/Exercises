import java.io.* ;

class ReversalOfElements
{

  public static void main ( String[] args ) 
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    
    // reverse the data
    for ( int j=0; j < data.length / 2; j++)
    {
        int tempNumber = data[j];
        data[j] = data[data.length - j -1];
        data[data.length - j - 1] = tempNumber;
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++)
    {
        System.out.println(data[j]);
    }

  }
}

// import java.io.* ;

// class ReversalOfElements
// {

//   public static void main ( String[] args )  
//   {
//     int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//     int[] result = new int[data.length];
    
//     // copy the data in reversed order to result
//     for ( int j=0; j < data.length; j++)
//     {
//         result[j] = data[data.length - j - 1];
//     }
      
//     // write out the result
//     for ( int j=0; j < result.length; j++)
//     {
//         System.out.println(result[j]);
//     }
//   }
// } 