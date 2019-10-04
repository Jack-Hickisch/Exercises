import java.util.*;

public class Farkle
{
    private static Random rand;
    
    public static void main (String[] args)
    {
        rand = new Random();
        Scanner scan = new Scanner(System.in);
        String player1, player2;
        int p1s = 0, p2s = 0, first_player = 0, second_player = 0; //  player __ score
        String[] count_of_dice = new String[6];

        s("Player one, what is your name?");
        player1 = scan.nextLine();

        s("Player two, what is your name?");
        player2 = scan.nextLine();

        s("");

        s("We will now role the dice, player 1, your turn"); // s = say
        int p1fr = rtd(); // player-1-first-role; role-the-dice
        ds(p1fr); // dice-statment

        s("player 2,");
        int p2fr = rtd();
        ds(p2fr);

        if (p1fr > p2fr)
        {
            s("Player 1 you go first");
            first_player = 1;
            second_player = 2;
        }
        else if (p2fr > p1fr)
        {
            s("Player 2 you go first");
            first_player = 2;
            second_player = 1;
        }
        else
        {
            s("Your order will be selected randomly: ");
            int random_selection = rand.nextInt(1) + 1;
            s("Player "+ random_selection + " you go first");
            first_player = random_selection;
            if (first_player == 1)
            {
                second_player = 2;
            }
            else
            {
                second_player = 1;
            }
        }
        s("");

        int d1 = 0; // dice __
        int d2 = 0; // dice __
        int d3 = 0; // dice __
        int d4 = 0; // dice __
        int d5 = 0; // dice __
        int d6 = 0; // dice __

        int d1c = 0; // dice __ count
        int d2c = 0; // dice __ count
        int d3c = 0; // dice __ count
        int d4c = 0; // dice __ count
        int d5c = 0; // dice __ count
        int d6c = 0; // dice __ count

        for (int i = 0; p1s < 10000 || p2s < 10000; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                s("Player " + first_player + " roles the following");

                d1 = rtd();
                s("1) " + d1);

                d2 = rtd();
                s("2) " + d2);

                d3 = rtd();
                s("3) " + d3);

                d4 = rtd();
                s("4) " + d4);

                d5 = rtd();
                s("5) " + d5);

                d6 = rtd();
                s("6) " + d6);

                // for (int k = 0; k < 6; k++)
                // {
                //     if (d + (k + 1) == k + 1)
                //     {
                //         d + (k + 1) + c += 1; 
                //     }
                // }
            }
        }
    }

    public static int rtd()
    {

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