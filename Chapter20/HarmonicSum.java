import java.util.Scanner;

public class HarmonicSum
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double n, sum = 0, i = 1;

        System.out.println("Enter N");
        n = scan.nextDouble();

        while (n >= i)
        {
            sum = sum + (1.0 / i);
            i++;
        }
        
        System.out.println("Sum is: " + sum);
    }
}