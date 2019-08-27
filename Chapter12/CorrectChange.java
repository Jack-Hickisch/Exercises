import java.util.Scanner;

public class CorrectChange
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int dollars, cents_entered, cents_remainder, quarters, dimes, nickels;

        System.out.println("Input the cents:");
        cents_entered = scan.nextInt();

        dollars = cents_entered / 100;
        quarters = (cents_entered - (dollars * 100)) / 25;
        dimes = (cents_entered - (dollars * 100) - (quarters * 25)) / 10;
        nickels = (cents_entered - (dollars * 100) - (quarters * 25) - (dimes * 10)) / 5;
        cents_remainder = (cents_entered - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5)) / 1;

        System.out.println("Your change is: " + dollars + " dollar(s) " + quarters + " quarter(s) " + dimes + " dime(s) " + nickels + " nickel(s )" + cents_remainder + " cents " );
    }
}