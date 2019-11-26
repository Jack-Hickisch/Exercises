import java.util.Arrays;

class ArrayEquality
{
  public static boolean myEquals( int[] a, int[] b )
  {
      if (a == null || b == null || a.length != b.length)
      {
        return false;
      }
      else
      {
        int pos = 0;

        for (int num : a)
        {
          if (a[pos] != b[pos])
          {
              return false;
          }
          pos++;
        }
  
        return true;
      }
  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };

    System.out.print("Arrays says: ")    ;
    if ( Arrays.equals( arrayA, null ) )
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      

    System.out.print("myEquals says: ")    ;
    if ( myEquals( arrayA, null ) ) 
      System.out.println( "Equal" );
    else
      System.out.println( "NOT Equal" );      
  }
}