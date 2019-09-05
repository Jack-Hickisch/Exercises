import java.util.Scanner;

public class DiscountPrices
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int amount_of_purchases;
        
        System.out.println("Enter amount of purchases: ");
        amount_of_purchases = scan.nextInt();

        if (amount_of_purchases > 10)
        {
            System.out.println("Discounted price: " + amount_of_purchases * 9 / 10);
        }
        else
        {
            System.out.println("There is no discount");
        }
    }
}