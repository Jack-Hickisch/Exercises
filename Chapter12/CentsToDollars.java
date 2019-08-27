import java.util.Scanner;

public class CentsToDollars
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int dollars, cents_remainder, cents;

        System.out.println("Input the cents:");
        cents = scan.nextInt();

        dollars = cents / 100;
        cents_remainder = cents % 100;

        System.out.println("That is " + dollars + " dollars and " + cents_remainder + " cents");
    }
}