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
        int sentencePosition = 0;

        for (int i = 0; i < sentence.length(); i++)
        {
            int letterPostition = 0;

            for (String letter : alphabet)
            {
                if (alphabet[letterPostition].equals(sentence.charAt(sentencePosition) + "")) // converts the char to a string to be compared
                {
                    letterCount[letterPostition] += 1;
                }
                
                letterPostition++;
            }

            sentencePosition ++;
        }

        boolean isPanagram = true;
        int letterPostition = 0;

        for (int amount : letterCount)
        {
            if (amount == 0)
            {
                isPanagram = false;

                System.out.println(alphabet[letterPostition] + " is missing");
            }
            else if (amount > 1)
            {
                System.out.println(alphabet[letterPostition] + " occurs " + amount + " times");
            }

            letterPostition ++;
        }

        if (isPanagram)
        {
            System.out.println(sentence + " phrase IS a panagram");
        }
        else
        {
            System.out.println(sentence + " is NOT a panagram");
        }
    }
}