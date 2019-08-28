import java.util.Scanner;

public class DistanceABrickTravels
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        Double distance, gravity, time;
        gravity = 32.174;

        System.out.println("What is the time in seconds: ");
        time = scan.nextDouble();

        distance = (.5) * gravity * time * time;

        System.out.println("The distance is: " + distance);
    }
}