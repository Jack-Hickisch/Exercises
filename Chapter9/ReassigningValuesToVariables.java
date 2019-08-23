public class ReassigningValuesToVariables
{
    public static void main ( String[] args )
    {
        double x = 0.0, y;

        y = (3 * Math.pow(x, 2)) - (8 * x) + 4;
        System.out.println("the equation = " + y + " when X = " + x);

        x = 2.0;
        y = (3 * Math.pow(x, 2)) - (8 * x) + 4;
        System.out.println("the equation = " + y + " when X = " + x);

        x = 4.0;
        y = (3 * Math.pow(x, 2)) - (8 * x) + 4;
        System.out.println("the equation = " + y + " when X = " + x);

    }
}
