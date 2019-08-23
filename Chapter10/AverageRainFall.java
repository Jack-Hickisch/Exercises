public class AverageRainFall
{
    public static void main(String[] args)
    {
        double rainapril = 12;
        double rainmay = 14;
        double rainjune = 8;

        System.out.println("Rainfall for April: \t" + rainapril);
        System.out.println("Rainfall for May: \t" + rainmay);
        System.out.println("Rainfall for June: \t" + rainjune);
        System.out.println("Average rainfall: \t" + ( rainapril + rainmay + rainjune) / 3 );
    }
}