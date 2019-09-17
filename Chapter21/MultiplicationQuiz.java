import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1, num2, proposed_ans, q_count = 0;

        for (int i = 1; i < 10; i++)
        {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);

            System.out.println("What is " + num1 + " * " + num2);
            proposed_ans = scan.nextInt();

            if (num1 * num2 == proposed_ans)
            {
                System.out.println("Right!");
                q_count += 1;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }

        System.out.println("You got " + q_count + " out of 10 questions correct!");
    }
}