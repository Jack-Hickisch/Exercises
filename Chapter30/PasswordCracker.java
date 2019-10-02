import java.util.*;

public class PasswordCracker
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String real_pswrd = "", temp_pswrd = "", chars = "qwertyuiopasdfghjklzxcvbnm";
        boolean guess = false;
        int rounds, count = 0;

        System.out.println("Enter a secret password -->");
        real_pswrd = scan.nextLine();

        if (real_pswrd.length() > 5)
        {
            System.out.println("Invalid Length; press Ctrl + C to exit");
        }

        while (!guess)
        {
            rounds = rand.nextInt(5) + 1;

            for (int i = 0; i < rounds; i++);
            {
                int random_place = rand.nextInt(26);
                temp_pswrd += chars.substring(random_place, random_place + 1);
                count++;
                System.out.println(temp_pswrd);
            }
            temp_pswrd = "";
        }
        
        if (temp_pswrd.equals(real_pswrd))
        {
            guess = true;
            System.out.println("It took " + count + " tries to guess your password");
        }
    }
}