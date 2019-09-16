import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, proposed_ans;

        for (int i = 1; i < 10; i++)
        {
            num1 = random.nextInt();
            num2 = random.nextInt();

            System.out.println("What is " + num1 + " * " + num2);
            proposed_ans = scan.nextInt();

            if (num1 * num2 == proposed_ans)
            {
                System.out.println("Right!");
            }
            else
            {
                System.out.println("Wrong!");
            }
        }
    }
}