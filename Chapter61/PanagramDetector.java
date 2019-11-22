import java.util.*;

public class PanagramDetector
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scan.nextLine();

        int[] letterCount = new int[26];
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < sentence.length(); i++)
        {
            for (String letter : alphabet)
            {
                int letterPostition = 0;

                if (sentence.charAt(letterPostition) >= 0)
                {
                    letterCount[letterPostition] += 1;
                }
                
                letterPostition++;
            }
        }

        boolean isPanagram = true;

        for (int amount : letterCount)
        {
            System.out.println(amount);
            if (amount == 0)
            {
                isPanagram = false;
            }
        }

        System.out.println(isPanagram);
    }
}