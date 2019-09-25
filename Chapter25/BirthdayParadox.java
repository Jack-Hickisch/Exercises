import java.util.Scanner;

public class BirthdayParadox
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double probability = 1, n, n_where_found = 0, current_probability = 1;
        boolean go_again = true;

        System.out.println("Enter the number of people:");
        n = scan.nextDouble();

        for (int i = 0; n > i; i++)
        {
            probability *= ( 365.0 - i ) / 365.0;
        }

        System.out.println("The probablility that the do not share a birthday is " + probability);

        for (int i = 0; go_again; i++)
        {
            current_probability *= ( 365.0 - i ) / 365.0;
            
            if (current_probability < 0.5)
            {
                go_again = false;
                n_where_found = i;
            }
        }

        System.out.println("The number of guests it takes for there to be more than a 50% chance that none share a birthday is " + (int) n_where_found + " guests");
    }
}