import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double x, e = Math.exp(1), sum, factorial = 1;
        int count = 1;
        double[] factorials = new double[22];
        
        System.out.println("");
        System.out.println("Enter x: ");
        x = scan.nextDouble();
        
        System.out.println("");
        sum = x + 1;

        int count_for_large_factorial_loop = 1;
        int num_currentally_finding_factorial_of = 1;
        while (count_for_large_factorial_loop <= 20)
        {
            while (count <= num_currentally_finding_factorial_of)
            {
                factorial *= count;
                count ++;
            }
            
            factorials[count - 1] = factorial;
            count = 1;
            factorial = 1;
            num_currentally_finding_factorial_of += 1;

            count_for_large_factorial_loop ++;
        }

        count = 0;
        while (count <= 19)
        {
            double term = Math.pow(x, (count + 1)) / factorials[count + 1];
            sum += term;
            System.out.println("n:" + (count + 1) + "\t\t term: " + term + "\t\t\t sum: " + sum);
            count ++;
        }

        System.out.println("");
        System.out.println("my   e^x: " + sum);
        System.out.println("real e^x: " + Math.pow(e, x));
    }
}