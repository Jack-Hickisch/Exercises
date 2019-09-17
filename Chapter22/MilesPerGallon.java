import java.util.Scanner;

public class MilesPerGallon
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double im, fm, g, mpg;
        boolean go_again = true;

        while (go_again)
        {

            System.out.println("Initial miles: ");
            im = scan.nextDouble();

            if (im >= 0)
            {
                System.out.println("Final miles: ");
                fm = scan.nextDouble();

                System.out.println("Gallons: ");
                g = scan.nextDouble();

                mpg = ( fm - im ) / g;

                System.out.println("Miles per Gallon: " + mpg);
            }
            else
            {
                System.out.print("bye");
                go_again = false;
            }
        }

    }
}