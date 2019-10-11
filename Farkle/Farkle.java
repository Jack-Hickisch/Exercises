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

        s("We will now roll the dice, player 1, your turn"); // s = say
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

        int[] rolls = new int[6];

        int d1c = 0; // dice __ count
        int d2c = 0; // dice __ count
        int d3c = 0; // dice __ count
        int d4c = 0; // dice __ count
        int d5c = 0; // dice __ count
        int d6c = 0; // dice __ count
        boolean dice_number_1_put_aside = false;
        boolean dice_number_2_put_aside = false;
        boolean dice_number_3_put_aside = false;
        boolean dice_number_4_put_aside = false;
        boolean dice_number_5_put_aside = false;
        boolean dice_number_6_put_aside = false;
        int odd_or_even_turn = 0;

        for (int i = 0; p1s < 10000 && p2s < 10000; i++)
        {

            for (boolean done_with_first_player_turn = false; !done_with_first_player_turn;)
            {

                if (odd_or_even_turn % 2 == 0)
                {
                    s("Player " + first_player + " rolls the following");
                }

                if (odd_or_even_turn % 2 == 1)
                {
                    s("Player " + second_player + " rolls the following");
                }

                for (int j = 0; j < 6; j++)
                {
                    if (!dice_number_1_put_aside && j == 0)
                    {
                        rolls[j] = rtd();
                        System.out.println("1) " + rolls[j]);
                    }
                    if (!dice_number_2_put_aside && j == 1)
                    {
                        rolls[j] = rtd();
                        System.out.println("2) " + rolls[j]);
                    }
                    if (!dice_number_3_put_aside && j == 2)
                    {
                        rolls[j] = rtd();
                        System.out.println("3) " + rolls[j]);
                    }
                    if (!dice_number_4_put_aside && j == 3)
                    {
                        rolls[j] = rtd();
                        System.out.println("4) " + rolls[j]);
                    }
                    if (!dice_number_5_put_aside && j == 4)
                    {
                        rolls[j] = rtd();
                        System.out.println("5) " + rolls[j]);
                    }
                    if (!dice_number_6_put_aside && j == 5)
                    {
                        rolls[j] = rtd();
                        System.out.println("6) " + rolls[j]);
                    }

                    if (rolls[j] == 1)
                    {
                        d1c += 1;
                    }
                    if (rolls[j] == 2)
                    {
                        d2c += 1;
                    }
                    if (rolls[j] == 3)
                    {
                        d3c += 1;
                    }
                    if (rolls[j] == 4)
                    {
                        d4c += 1;
                    }
                    if (rolls[j] == 5)
                    {
                        d5c += 1;
                    }
                    if (rolls[j] == 6)
                    {
                        d6c += 1;
                    }
                }

                s("");

                if (!isFarkle(d1c, d2c, d3c, d4c, d5c, d6c) && !isHotDice(rolls))
                {
                    done_with_first_player_turn = true;

                    for (boolean keep_asking_for_dice = true; keep_asking_for_dice;)
                    {
                        s("Which number would you like to put aside? (enter the place of the numbers in the list or input 0 end putting aside)");
                        int number_entered = scan.nextInt();

                        if (!dice_number_1_put_aside)
                        {
                            dice_number_1_put_aside = number_entered == 1;
                        }
                        if (!dice_number_2_put_aside)
                        {
                            dice_number_2_put_aside = number_entered == 2;
                        }
                        if (!dice_number_3_put_aside)
                        {
                            dice_number_3_put_aside = number_entered == 3;
                        }
                        if (!dice_number_4_put_aside)
                        {
                            dice_number_4_put_aside = number_entered == 4;
                        }
                        if (!dice_number_5_put_aside)
                        {
                            dice_number_5_put_aside = number_entered == 5;
                        }
                        if (!dice_number_6_put_aside)
                        {
                            dice_number_6_put_aside = number_entered == 6;
                        }
        
                        if (number_entered == 0)
                        {
                            keep_asking_for_dice = false;
                        }
                        else if (number_entered != 1 || number_entered != 2 || number_entered != 3 || number_entered != 4 || number_entered != 5 || number_entered != 6)
                        {
                            s("That is not a valid input or you did not put aside at least one dice");
                        }

                        if (keep_asking_for_dice)
                        {
                            s("");

                            s("Would you like to continue? (0 = no, 2 = done with whole turn, any other # = yes)");
                            int continue_with_putting_aside = scan.nextInt();
                            if (continue_with_putting_aside == 0)
                            {
                                keep_asking_for_dice = false;
                            }
                            else if (continue_with_putting_aside == 2)
                            {
                                keep_asking_for_dice = false;
                                odd_or_even_turn += 1;
                                
                            }
                            else
                            {
                                keep_asking_for_dice = true;
                            }

                            s("");
                        }
                    }
                }
                else if (isFarkle(d1c, d2c, d3c, d4c, d5c, d6c))
                {
                    p1s += 0;
                    s("You roled a Farkle and the turn will now pass to the second player");
                    s("");
                    done_with_first_player_turn = true;
                }
                else
                {
                    s("You roled Hot Dice and will need to re-role all of your dice");
                    s("");
                    done_with_first_player_turn = false;
                }

                // boolean hd = isFarkle(d1c, d2c, d3c, d4c, d5c, d6c);
                // System.out.println(hd);
                // if (hd)
                // {
                //     p1s = 100000000;
                // }

                d1c = 0; // dice __ count
                d2c = 0; // dice __ count
                d3c = 0; // dice __ count
                d4c = 0; // dice __ count
                d5c = 0; // dice __ count
                d6c = 0; // dice __ count

                rolls[0] = 0;
                rolls[1] = 0;
                rolls[2] = 0;
                rolls[3] = 0;
                rolls[4] = 0;
                rolls[5] = 0;
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

    public static boolean isFarkle(int d1c, int d2c, int d3c, int d4c, int d5c, int d6c)
    {
        if (d1c < 1 && d5c < 1 && d2c < 3 && d3c < 3 && d4c < 3 && d6c < 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isHotDice(int[] rolls)
    {
        int hdc = 0; // hot dice count

        for (int i = 0; i < 6; i++)
        {
            if (rolls[i] == 1 || rolls[i] == 5)
            {
                hdc += 1;
            }

            else if (rolls[i] == 2)
            {
                int c2 = 0; // two count
                for (int j = 0; j < 6; j++)
                {
                    if (rolls[j] == 2)
                    {
                        c2 += 1;
                    }
                }

                if (c2 == 3)
                {
                    hdc += 1;
                }
            }

            else if (rolls[i] == 3)
            {
                int c3 = 0; // three count
                for (int j = 0; j < 6; j++)
                {
                    if (rolls[j] == 3)
                    {
                        c3 += 1;
                    }
                }

                if (c3 == 3)
                {
                    hdc += 1;
                }
            }

            else if (rolls[i] == 4)
            {
                int c4 = 0; // four count
                for (int j = 0; j < 6; j++)
                {
                    if (rolls[j] == 4)
                    {
                        c4 += 1;
                    }
                }

                if (c4 == 3)
                {
                    hdc += 1;
                }
            }

            else if (rolls[i] == 6)
            {
                int c6 = 0; // six count
                for (int j = 0; j < 6; j++)
                {
                    if (rolls[j] == 6)
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