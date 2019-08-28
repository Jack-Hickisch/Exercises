import java.util.Scanner;

public class AnnualApplianceCost
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        Double cost_per_kilowatt_hour, number_kilowatt_hours, annual_cost;

        System.out.println("Enter the cost per kilowatt-hour in cents: ");
        cost_per_kilowatt_hour = scan.nextDouble();

        System.out.println("Enter the kilowatt-hours used per year: ");
        number_kilowatt_hours = scan.nextDouble();

        annual_cost = ( cost_per_kilowatt_hour * number_kilowatt_hours ) / 100;

        System.out.println( "The annual cost is: " + annual_cost );
    }
}