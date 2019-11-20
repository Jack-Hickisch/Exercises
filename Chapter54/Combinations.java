import java.util.Scanner;

public class Combinations
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner( System.in );

        for (boolean stop = false; !stop;)
        {
            System.out.println("Enter N");
            double n = scan.nextDouble();

            System.out.println("Enter R");
            double r = scan.nextDouble();



            if (factorialAnswer(r) != -1 && factorialAnswer(n) != -1)
            {
                System.out.println(combinationsAnswer( n , r ));
            }
            else
            {
                System.out.println("ERROR - int out of bounds");
                stop = true;
            }
        }
    }

    public static double factorialAnswer(double n)
    {
        double number = n;

        double returnNumber = 1;

        if (number > 0 && number < 20)
        {
            for (double i = number; i != 0; i--)
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

    public static double combinationsAnswer(double n , double r)
    {
        // System.out.println(factorialAnswer(n));
        // System.out.println(factorialAnswer(r));
        // System.out.println(factorialAnswer(n - r));
        return factorialAnswer(n) / (factorialAnswer(r) * factorialAnswer( n - r ));
    }
}