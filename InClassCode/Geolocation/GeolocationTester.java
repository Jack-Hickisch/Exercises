public class GeolocationTester
{
    public static void main (String args[])
    {
        Geolocation geo = new Geolocation("Jacktown", 0, 0);
        Geolocation geo2 = new Geolocation(1, 0);

        System.out.println(geo.distance(geo2.getLatitude(), geo2.getLongitude()));
    }
}