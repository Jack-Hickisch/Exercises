import java.util.Scanner;

public class AddingUpIntegers
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int ints_to_add, sum = 0, i = 0;

        System.out.println("How many integers will be added: ");
        ints_to_add = scan.nextInt();

        while (ints_to_add > i)
        {
            System.out.println("Enter an integer: ");
            sum += scan.nextInt();
            i++;
        }

        System.out.print("The sum is " + sum);
    }
}
