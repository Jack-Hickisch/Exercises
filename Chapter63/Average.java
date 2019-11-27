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

public class Average
{
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    int avg = june.average();
    System.out.println("average (approx cuz int) = " + avg );
  }
}   