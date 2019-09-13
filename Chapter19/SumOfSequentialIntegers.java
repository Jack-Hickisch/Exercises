import java.util.Scanner;

public class SumOfSequentialIntegers
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int sum_via_loop = 0, sum_via_formula, n, i = 0;

        System.out.println("Enter N:");
        n = scan.nextInt();

        while (n >= i)
        {
            sum_via_loop += i;
            i += 1;
        }

        sum_via_formula = (n * ( n + 1 )) / 2;

        System.out.println("Loop Sum = " + sum_via_loop);
        System.out.println("Formula Sum = " + sum_via_formula);
    }
}
