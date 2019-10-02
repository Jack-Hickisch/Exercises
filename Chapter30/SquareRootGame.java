import java.util.*;

public class SquareRootGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int rounds, p1c = 0, p2c = 0; // c = count
        String p1, p2;
        double num = 0, sqrt = 0, p1g = 0, p2g = 0, p1d = 0, p2d = 0; // d = differnence; g = guess
        
        System.out.println("How many rounds?");
        rounds = scan.nextInt();
        scan.nextLine(); // counsume the last line Stack overflow link --> https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        
        System.out.println("First Player, sign in-->");
        p1 = scan.nextLine();

        System.out.println("Second Player, sign in-->");
        p2 = scan.nextLine();
        
        for (int i = 0; i < rounds; i++)
        {
            num = rand.nextDouble() * 99 + 1; // 1.0 to slightly less than 100.0
            System.out.println("What is the square root of " + num + "?");

            System.out.print(p1 + ", your guess: ");
            p1g = scan.nextDouble();

            System.out.print(p2 + ", your guess: ");
            p2g = scan.nextDouble();

            sqrt = Math.pow(num, 0.5);
            System.out.println("The correct square root is: " + sqrt);

            p1d = Math.abs(sqrt - p1g);
            p2d = Math.abs(sqrt - p2g);
            System.out.println(p1 + " is " + p1d + " away");
            System.out.println(p2 + " is " + p2d + " away");

            if (p1d < p2d)
            {
                System.out.println(p1 + " wins!");
                p1c += 1;
            }
            else if (p2d < p1d)
            {
                System.out.println(p2 + " wins!");
                p2c += 1;
            }
            else
            {
                System.out.println("tie!");  
            }

            System.out.println("");
        }

        System.out.println("---- Final Score ----");
        System.out.println(p1 + ": " + p1c + "  " + p2 + ": " + p2c);
    }
}