import java.util.Scanner;

public class SheepHerdSize
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double n = 0, years_supervised = 0, power = 1;

        for (int t = 0; t <= 25; t++)
        {
            power *= 0.83;

            // System.out.println(exponent);
            n = 220 / ( 1 + ( 10 * power ) );
            System.out.println(n);

            if (n < 80)
            {
                years_supervised ++;
            }

        }
        System.out.println("The sheep need to be supervised for " + years_supervised + " years");
    }
}