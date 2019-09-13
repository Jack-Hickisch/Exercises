import java.util.Scanner;

public class WordsSeperatedByDots
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int length1, length2, amount_of_dots, i = 0;
        String word1, word2;

        System.out.println("Enter first word: ");
        word1 = scan.nextLine();

        System.out.println("Enter second word: ");
        word2 = scan.nextLine();

        length1 = word1.length();
        length2 = word2.length();

        amount_of_dots = 30 - (length1 + length2);

        if (amount_of_dots < 0)
        {
            System.out.println("Invalid Entry");
        }
        else
        {
            System.out.print(word1);

            while (amount_of_dots > i)
            {
                System.out.print(".");
                i += 1;

            }
            System.out.print(word2);
        }
    }
}
