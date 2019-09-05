import java.util.Scanner;

public class PieEatingContest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double weight;
        
        System.out.println("What is your weight in lbs?");
        weight = scan.nextDouble();
        
        if (weight > 30 && weight < 250)
        {
            System.out.println("Yay! You can compete in the State Fair Pie Eating Contest");
        }
        else
        {
            System.out.println("You are not allowed into the contest");
        }
    }
}