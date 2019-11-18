import java.util.Scanner;

public class OdiousNumbers
{
    public static void main (String args[])
    {
        long number;
        Scanner scan = new Scanner ( System.in );

        for (boolean done = false; !done ;)
        {
            System.out.println("Enter your number");
            number = scan.nextLong();

            if (number >= 0)
            {
                if (odiousTF(number))
                {
                    System.out.println("is odious");
                }
                else
                {
                   System.out.println("is not odious");
                }
                System.out.println("");
                System.out.println("");
            }
            else
            {
                done = true;
            }
        }
    }

    public static boolean odiousTF(long number)
    {
        long currentNumber = number;
        long oneCount = 0;

        for (boolean done = false; !done ;)
        {
            if (currentNumber % 2 == 1)
            {
                oneCount += 1;
            }
            
            currentNumber /= 2;

            if (currentNumber == 0)
            {
                done = true;
                if (oneCount % 2 != 0)
                {
                    return true;
                    // System.out.println(oneCount);
                }
                return false;
            }
        }

        return false;
    }
}