import java.util.Scanner;

public class FantacyGame
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int strength, health, luck, total;
        String name;

        System.out.println("Welcome to \033[3mYertle's Quest \033[0m");

        System.out.println("Enter the name of your character: ");
        name = scan.nextLine();
        
        System.out.println("Enter strength (1- 10):");
        strength = scan.nextInt();

        System.out.println("Enter health (1- 10):");
        health = scan.nextInt();

        System.out.println("Enter luck (1- 10):");
        luck = scan.nextInt();

        total = strength + health + luck;

        if (total > 15)
        {
            System.out.println("You have give your character too many points!");
            System.out.println("Default values have been assigned:");

            strength = 5;
            health = 5;
            luck = 5;

            System.out.println(name + ", strength: 5, health: 5, luck: 5");
        }
        else
        {
            System.out.println("You are ready for battle!!!");
        }
    }
}