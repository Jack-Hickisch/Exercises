import java.util.Scanner;

public class HarmonicMean
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        Float x, y, harmonic_mean, arithmetic_mean;

        System.out.println("Enter your first number: ");
        x = scan.nextFloat();

        System.out.println("Enter your second number: ");
        y = scan.nextFloat();
        
        arithmetic_mean = (x + y) / 2;
        harmonic_mean = 2 / (( 1 / x ) + ( 1 / y ));

        System.out.println("The arithmetic mean is: " + arithmetic_mean);
        System.out.println("The harmonic mean is: " + harmonic_mean);
    }
}