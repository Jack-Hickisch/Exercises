import java.util.Scanner;

public class YourAgeinSeconds
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double years, months, days, total_seconds, seconds_years, seconds_months = 0, seconds_days, billion_large_number_thingyyyy = 2500000000.0;
        double[] months_day_values;
        
        System.out.println("Enter Years:");
        years = scan.nextDouble();
        
        System.out.println("Enter Months:");
        months = scan.nextDouble();

        System.out.println("Enter Days:");
        days = scan.nextDouble();

        months_day_values = new double[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        seconds_years = years * 365 * 24 * 60 * 60;
        seconds_days = days * 24 * 60 * 60;
          
        for (int i = 0; i < months; i++)
        {
            seconds_months += months_day_values[i] * 24 * 60 * 60;
        }

        total_seconds = seconds_years + seconds_months + seconds_days;
        

        System.out.println("Your age in seconds is: " + total_seconds);

        System.out.println("You have lived " + total_seconds / billion_large_number_thingyyyy * 100 + "% of your life ");
    }
}