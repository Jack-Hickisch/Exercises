import java.util.Scanner;

public class RunOfIntegers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int start, end, i;

        System.out.println("Enter Start: ");
        start = scan.nextInt();

        System.out.println("Enter End: ");
        end = scan.nextInt();

        while (start <= end)
        {
            System.out.println(start);

            start += 1;
        }
    }
}