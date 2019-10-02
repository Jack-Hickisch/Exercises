import java.util.*;

public class PasswordCracker
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String real_pswrd = "", tempPassword = "", chars = "qwertyuiopasdfghjklzxcvbnm";
        boolean guess = false;
        int rounds, count = 0, random_place = 0;

        System.out.println("Enter a secret password -->");
        real_pswrd = scan.nextLine();

        if (real_pswrd.length() > 5)
        {
            System.out.println("Invalid Length");
            guess = true;
        }

        while (!guess)
        {
            // System.out.println(real_pswrd.length());
            for (int i = 0; i < real_pswrd.length(); i++)
            {
                random_place = rand.nextInt(26);
                String str = chars.substring(random_place, random_place + 1);
                tempPassword += str;
                count++;
            }
        
            if (tempPassword.equals(real_pswrd))
            {
                guess = true;
                System.out.println("It took " + count + " tries to guess your password");
            }
            
            tempPassword = "";
        }
    }
}