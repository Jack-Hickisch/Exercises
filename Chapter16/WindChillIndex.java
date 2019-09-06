import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        double wind_speed, temp, wind_chill;
        
        System.out.println("Enter Wind Speed:");
        wind_speed = scan.nextDouble();
        
        System.out.println("Enter Temperature:");
        temp = scan.nextDouble();
        
        if ( wind_speed < 3 || temp > 50)
        {
            wind_chill = temp;
        }
        else
        {
            wind_chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow( wind_speed, 0.16 ) + 0.4275 * temp * Math.pow( wind_speed, 0.16 ); 
        }
        
        System.out.println("Wind Chill: " + wind_chill);
    }
}