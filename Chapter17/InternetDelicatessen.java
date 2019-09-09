import java.util.Scanner;

public class InternetDelicatessen
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double price;
        int overnight_delivery;
        String item;

        System.out.println("Enter the item: ");
        item = scan.nextLine();

        System.out.println("Enter the price: ");
        price = scan.nextDouble();

        System.out.println("Overnight delivery (==no, 1==yes): ");
        overnight_delivery = scan.nextInt();
    }
}