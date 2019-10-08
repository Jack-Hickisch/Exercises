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

        int[] roles = new int[6];

        int d1c = 0; // dice __ count
        int d2c = 0; // dice __ count
        int d3c = 0; // dice __ count
        int d4c = 0; // dice __ count
        int d5c = 0; // dice __ count
        int d6c = 0; // dice __ count

        for (int i = 0; p1s < 10000 && p2s < 10000; i++)
        {
            s("Player " + first_player + " roles the following");

            for (int j = 0; j < 6; j++)
            {
                roles[j] = rtd();
                System.out.println(roles[j]);

                if (roles[j] == 1)
                {
                    d1c += 1;
                }
                if (roles[j] == 2)
                {
                    d2c += 1;
                }
                if (roles[j] == 3)
                {
                    d3c += 1;
                }
                if (roles[j] == 4)
                {
                    d4c += 1;
                }
                if (roles[j] == 5)
                {
                    d5c += 1;
                }
                if (roles[j] == 6)
                {
                    d6c += 1;
                }
            }

            boolean hd = isHotDice(roles);
            System.out.println(hd);
            if (hd)
            {
                p1s = 100000000;
            }
        }
    }

    public static int rtd()
    {
        return rand.nextInt(6) + 1;
    }

    public static void ds(int n)
    {
        System.out.println("You rolled a " + n);
    }
    
    public static void s(String string)
    {
        System.out.println(string);
    }

    // public static boolean isFarkle()
    // {
    //     if (d1c < 1 && d5c < 1 && d2c < 3 && d3c < 3 && d4c < 3 && d6c < 3)
    //     {
    //         return true;
    //     }

    //     return false;
    // }

    public static boolean isHotDice(int[] roles)
    {
        int hdc = 0; // hot dice count

        for (int i = 0; i < 6; i++)
        {
            if (roles[i] == 1 || roles[i] == 5)
            {
                hdc += 1;
            }

            else if (roles[i] == 2)
            {
                int c2 = 0; // two count
                for (int j = 0; j < 6; j++)
                {
                    if (roles[j] == 2)
                    {
                        c2 += 1;
                    }
                }

                if (c2 == 3)
                {
                    hdc += 1;
                }
            }

            else if (roles[i] == 3)
            {
                int c3 = 0; // three count
                for (int j = 0; j < 6; j++)
                {
                    if (roles[j] == 3)
                    {
                        c3 += 1;
                    }
                }

                if (c3 == 3)
                {
                    hdc += 1;
                }
            }

            else if (roles[i] == 4)
            {
                int c4 = 0; // four count
                for (int j = 0; j < 6; j++)
                {
                    if (roles[j] == 4)
                    {
                        c4 += 1;
                    }
                }

                if (c4 == 3)
                {
                    hdc += 1;
                }
            }

            else if (roles[i] == 6)
            {
                int c6 = 0; // six count
                for (int j = 0; j < 6; j++)
                {
                    if (roles[j] == 6)
                    {
                        c6 += 1;
                    }
                }

                if (c6 == 3)
                {
                    hdc += 1;
                }
            }
        }

        if (hdc == 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}