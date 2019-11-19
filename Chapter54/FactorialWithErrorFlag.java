import java.util.Scanner;

public class FactorialWithErrorFlag
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        for (boolean stop = false; !stop;)
        {
            System.out.println("Enter your number");
            int number = scan.nextInt();


            if (factorialAnswer(number) != -1)
            {
                System.out.println(factorialAnswer(number));
            }
            else
            {
                System.out.println("ERROR - int out of bounds");
                stop = true;
            }
        }
    }

    public static int factorialAnswer(int n)
    {
        int number = n;

        int returnNumber = 1;

        if (number > 0 && number < 20)
        {
            for (int i = number; i != 0; i--)
            {
                returnNumber *= i;
                // System.out.print(returnNumber);
            }
        }
        else
        {
            return -1;
        }

        return returnNumber;
    }
}