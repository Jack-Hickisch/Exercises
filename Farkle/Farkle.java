import java.util.*;

public class Farkle
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String player1, player2;
        int p1s = 0, p2s = 0; //  player __ score

        s("Player one, what is your name?");
        player1 = scan.nextLine();

        s("Player two, what is your name?");
        player2 = scan.nextLine();

        s("We will now role the dice, player 1, your turn"); // s = say
        int p1fr = rtd(); // player-1-first-role; role-the-dice
        ds(p1fr); // dice-statment

        s("player 2,");
        int p2fr = rtd();
        ds(p2fr);

        int d1 = 0; // dice __
        int d2 = 0; // dice __
        int d3 = 0; // dice __
        int d4 = 0; // dice __
        int d5 = 0; // dice __
        int d6 = 0; // dice __

        for (int i = 0; p1s >= 10000 || p2s >= 10000; i++)
        {
            for (int i = 0; i < 6; i++)

        }
    }

    public static int rtd()
    {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void ds(int n)
    {
        System.out.println("You roled a " + n);
    }
    
    public static void s(String string)
    {
        System.out.println(string);
    }

}