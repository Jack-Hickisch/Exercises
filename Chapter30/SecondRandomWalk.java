import java.util.*;

public class SecondRandomWalk
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        double x = 0, y = 0;
        int iterations;

        System.out.println("Enter the iterations: ");
        iterations = scan.nextInt();

        for (int i = 0; i < iterations; i++)
        {
            x += rand.nextDouble() * 2 - 1;
            y += rand.nextDouble() * 2 - 1;
        }

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("distance from starting point: " + Math.abs(Math.pow((x * x) + (y * y), 0.5)));
    }
}