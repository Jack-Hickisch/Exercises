import java.util.Scanner;

public class FurtherSubstringFun
{
    public static void main(String[] args)
    {
        String str, substring, begin, end;
        Scanner scan = new Scanner( System.in );

        System.out.println("Enter your string: ");
        str = scan.nextLine();

        System.out.println("Enter the start index: ");
        begin = scan.nextLine();

        System.out.println("Enter the end index: ");
        end = scan.nextLine();

        substring = str.substring( Integer.valueOf(begin), Integer.valueOf(end) );

        System.out.println("Original String:" + str);
        System.out.println("Substring: " + substring);
    }
}