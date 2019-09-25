import java.util.Scanner;

public class TriangleAndSquareNumbers
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner( System.in );
        long current_square = 1, upper_limit, temp_sum = 0; // long because I want to be able to have higher limits

        System.out.println("Enter upper limit: ");
        upper_limit = scan.nextLong();

        for (long i = 1; i <= upper_limit; i++) // is it a square?
        {
            if ((int) Math.pow(i, 0.5) * (int) Math.pow(i, 0.5) == i) // if the long is a perfect square then when you cut off the decimals ((int)) it will still multiply correctally
            {
                current_square = i; // so it is a square; how about a triangle?
                for (long j = 1; j <= current_square; j++)
                {
                    temp_sum += j; // so it will count 1 + 2 + 3 ... and that will give us the triangles

                    if (temp_sum == current_square) // see if it is
                    {
                        System.out.println(current_square); // print it out
                    }
                }
            }

            temp_sum = 0;
        }
    }
}

// // in 19 lines of illegible code for fun!!! (they works too)
// import java.util.Scanner;
// public class TriangleAndSquareNumbers{
//     public static void main (String[] args){
//         Scanner scan = new Scanner( System.in );
//         long upper_limit, temp_sum = 0;
//         System.out.println("Enter upper limit: ");
//         upper_limit = scan.nextLong();
//         for (long i = 1; i <= upper_limit; i++){
//             if ((int) Math.pow(i, 0.5) * (int) Math.pow(i, 0.5) == i){
//                 for (long j = 1; j <= i; j++){
//                     temp_sum += j;
//                     if (temp_sum == i){
//                         System.out.println(i);
//                     }
//                 }
//             }
//             temp_sum = 0;
//         }
//     }
// }