public class DataTweaker 
{ 
  public static void main(String[] args)
  {    
    double[] data = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};
    double average = 0;

    int i = 0;
    for (double num : data)
    {
        average += num;
        System.out.println("data [ " + i + " ] = " + num);
        i++;
    }

    average /= data.length;

    double farFromNum = data[0];
    int position = 0;
    double indexOfNum = 0;

    for (double num : data)
    {
        if (Math.abs(num - average) > Math.abs(farFromNum - average))
        {
            farFromNum = num;
            indexOfNum = position;
        }
        position++;
    }

    double newAvg = 0;
    int indexOn = 0;

    for (double num : data)
    {
        if (indexOn != indexOfNum)
        {
            newAvg += num;
        }

        indexOn++;
    }

    newAvg /= data.length - 1;

    System.out.println("average: " + average);
    System.out.println("most distant value: " + farFromNum);
    System.out.println("new average: " + newAvg);
  } 
}