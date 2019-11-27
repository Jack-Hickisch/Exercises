class Weight
{
  private int[] data;
  
  // Constructor
  public Weight(int[] init)
  {
    // Make data the same length
    // as the array referenced by init.
    this.data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < data.length; j++)
    {  
        data[j] = init[j];
    }

    }
    public int average()
    {
        int average = 0;
        for (int data : data)
        {
            average += data;
        }

        average /= data.length;

        return average;
    }

    public int subAverage( int start, int end )
    {
        int average = 0;
        int pos = 0;

        for (int data : data)
        {
            if (start <= pos && end >= pos)
            {
                average += data;
            }

            pos++;
        }

        average /= end - start + 1;
        System.out.println(" ");

        return average;

    }

  //Print
  public String toString()
  {
    String statement = "data = ";

    for (int data : this.data)
    {
        statement += data + " ";
    }

    return statement;
  }
}

public class SubrangeOfDays
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    System.out.println("the average of the 1st half of the data set is:(approx cuz int) " + june.subAverage(0, values.length / 2 - 1) );
    System.out.println("the average of the 2nd half of the data set is:(approx cuz int) " + june.subAverage(values.length / 2, values.length - 1) );
  }
}   