import java.util.Scanner;

public class OrderChecker
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int bolts, nuts, washers, total_cost;
        boolean order_is_okay = true;
        
        System.out.println("Number of bolts: ");
        bolts = scan.nextInt();
        
        System.out.println("Number of nuts: ");
        nuts = scan.nextInt();
        
        System.out.println("Number of washers: ");
        washers = scan.nextInt();
        
        if (bolts > nuts)
        {
            System.out.println("Check the Order: too few nuts");
            order_is_okay = false;
        }
        
        if ((2 * washers) < bolts)
        {
            System.out.println("Check the Order: too few washers");
            order_is_okay = false;
        }

        if (order_is_okay)
        {
            System.out.println("Order is OK");
        }
        
        total_cost = (5 * bolts) + (3 * nuts) + (1 * washers);
        
        System.out.println("Total cost: " + total_cost);
    }
}