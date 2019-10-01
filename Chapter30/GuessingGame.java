import java.util.*;

public class GuessingGame
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int guess = 0, real_number = 0; // ouside range

        real_number = rand.nextInt(10) + 1;
        System.out.println("I am thinking of a number from 1 to 10. You mush guess what it is in three tries.");
        
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter a guess:");
            guess = scan.nextInt();

            if (guess == real_number)
            {
                System.out.println("RIGHT!");
                System.out.println("You have won the game");
                i = 3;
            }
            else if (i == 2)
            {
                System.out.println("You have lost the game.");
            }
            else
            {                
                System.out.println("wrong");
            }
        }
    }
}