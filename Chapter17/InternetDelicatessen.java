import java.util.Scanner;

public class InternetDelicatessen
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double price;
        int overnight_delivery, delivery_cost = 0;
        String item;

        System.out.println("Enter the item: ");
        item = scan.nextLine();

        System.out.println("Enter the price: ");
        price = scan.nextDouble();

        System.out.println("Overnight delivery (0==no, 1==yes): ");
        overnight_delivery = scan.nextInt();

        System.out.println("Invoice: ");
        System.out.println("\t" + item + " \t" + price);

        if (price < 10)
        {
            delivery_cost = 2;
        }

        if (overnight_delivery == 1)
        {
            delivery_cost += 3;
        }

        System.out.println("\tdelivery \t" + delivery_cost);
        System.out.println("\ttotal \t\t" + (delivery_cost + price));
    }
}