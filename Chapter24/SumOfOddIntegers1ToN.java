import java.util.Scanner;

public class SumOfOddIntegers1ToN
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int n, sum = 0, n_to_the_2nd;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 != 0)
            {
                sum += i;
            }
        }

        n_to_the_2nd = n * n;

        System.out.println("The sum is: " + sum);
        System.out.println("The square of " + n + " is: " + n_to_the_2nd);

    }
}