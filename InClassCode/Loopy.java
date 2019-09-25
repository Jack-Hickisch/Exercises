public class Loopy
{
    public static void main(String[] args)
    {

        System.out.println(doStuff(3, 5) + doStuff(4, 6));


        
    }

    // signature
    public static int doStuff(int a, int b)
    {
        int result = a + b;
        return result;
    }
}