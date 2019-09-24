import java.util.Scanner;

public class SumOfDivisorsOfN
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int sum = 0, n;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }

        System.out.println("The sum is " + sum);

        if (sum == n)
        {
            System.out.println("N is a perfect number!");
        }
        else
        {
            System.out.println("N is not a perfect number");
        }
    }
}