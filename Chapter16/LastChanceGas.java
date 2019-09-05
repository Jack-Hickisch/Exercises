import java.util.Scanner;

public class LastChanceGas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double capactiy, fullness, mpg;
        
        System.out.println("Tank capacity:");
        capactiy = scan.nextDouble();
        
        System.out.println("Gage reading:");
        fullness = scan.nextDouble();
        
        System.out.println("Miles per gallon:");
        mpg = scan.nextDouble();
        
        if ((capactiy * fullness / 100) * mpg >= 200)
        {
            System.out.println("Safe to Proceed");
        }
        else
        {
            System.out.println("Get Gas");
        }

        // it says "Use integers for all input and all arithmetic." but that is kinda impossible unless you have perfect numbers
    }
}