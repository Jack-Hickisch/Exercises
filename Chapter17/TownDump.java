import java.util.Scanner;

public class TownDump
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int price, lbs;

        System.out.println("Enter your lbs of trash: ");
        lbs = scan.nextInt();

        if (lbs <= 200)
        {
            price = 20;
        }
        else
        {
            price = (((lbs - 200) / 100) * 8) + 28;
        }

        System.out.println("charge: $" + price);
    }
}