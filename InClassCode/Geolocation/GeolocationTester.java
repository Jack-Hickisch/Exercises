public class GeolocationTester
{
    public static void main (String args[])
    {
        Geolocation geo = new Geolocation("Jacktown", 15, 17);
        Geolocation geo2 = new Geolocation(1, -4);

        System.out.println(geo.distance(geo2.getLatitude(), geo2.getLongitude()));
    }
}