import java.util.Scanner;

public class PowerOfANumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n, count;
        double x, total = 1;

        System.out.println("Enter X");
        x = scan.nextDouble();

        System.out.println("Enter N");
        n = scan.nextInt();

        count = 1;

        if (n >= 0)
        {
            while (count <= n)
            {
                total = total * x;
                count += 1;
            }

            System.out.println(x + " raised to the power " + n + " is: " + total);
        }
        else
        {
            System.out.println("N must be a positive integer.");
        }
    }
}