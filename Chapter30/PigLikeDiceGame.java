import java.util.*;

public class PigLikeDiceGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int player_score = 0, player_temp_score = 0, computer_score = 0, computer_score_in_round = 0, dice_role = 0;
        String player_wish_continue_input;
        boolean go_again = true, player_wish_to_continue = true;

        while (player_score < 100 && computer_score < 100)
        {
            go_again = true;
            System.out.println("Computers Turn: ");
            computer_score_in_round = rand.nextInt(6) + 1 + rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
            System.out.println("The computer gets a total of " + computer_score_in_round + " points");
            computer_score += computer_score_in_round;
            player_temp_score = 0;

            while (go_again)
            {
                dice_role = rand.nextInt(6) + 1;
                
                if (dice_role != 1)
                {
                    System.out.println("You roled a " + dice_role + ", would you like to continue? (y = yes; anything else = no)");
                    player_wish_continue_input = scan.nextLine();

                    if (player_wish_continue_input.equals("y"))
                    {
                        player_wish_to_continue = true;
                    }
                    else
                    {
                        player_wish_to_continue = false;
                    }

                    if (player_wish_to_continue)
                    {
                        player_temp_score += dice_role;
                    }
                    else
                    {
                        go_again = false;
                        player_score += player_temp_score;
                    }
                }
                else
                {
                    System.out.println("Sorry you roled a one!");
                    go_again = false;
                }
            }
            
            System.out.println("");
            System.out.println("Computer Score: " + computer_score);
            System.out.println("Your Score: " + player_score);
            System.out.println("");
        }

        System.out.println("");

        if (computer_score > player_score)
        {
            System.out.println("You lose!");
        }
        else if (computer_score < player_score)
        {
            System.out.println("You win!!!");
        }
        else
        {
            System.out.println("Its a tie!!!!!");
        }
    }
}