import java.util.*;

public class PasswordCracker
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String real_pswrd = "", temp_pswrd = "", chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        boolean guess = false;

        System.out.println("Enter a secret password -->");
        real_pswrd = scan.nextLine();

        for (int i = 0; !guess; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                temp_pswrd += chars.substring(i, i + 1);
                System.out.println(temp_pswrd);
            }
            temp_pswrd = "";
        }
    }
}