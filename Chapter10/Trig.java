public class Trig
{
    public static void main(String[] args)
    {
        double sinx = Math.sin(99);
        double cosx = Math.cos(99);
        double squares = Math.pow(sinx, 2) + Math.pow(cosx, 2);

        System.out.println("Sine of x:" + sinx);
        System.out.println("Cosine of x:" + cosx);
        System.out.println("The sum of those added together is: " + squares);
    }
}