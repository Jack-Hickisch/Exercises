public class GeolocationTester
{
    public static void main (String args[])
    {
        Geolocation geo = new Geolocation("Jacktown", 39.523164, -104.965859);
        Geolocation geo2 = new Geolocation(82.5013339, -62.343192);

        System.out.println(geo.distance(geo2.getLatitude(), geo2.getLongitude()));
        System.out.println(geo.withinDistance(geo2.getLatitude(), geo2.getLongitude(), 5023));

        System.out.println(geo.getLatitude());
        System.out.println(geo.getLongitude());

        WeatherInfo matt     = new WeatherInfo("matt", -42.88067, 68.66269, 79);
        WeatherInfo isabella = new WeatherInfo("isabella", -54.74888, 24.22714, 52);
        WeatherInfo jack     = new WeatherInfo("jack", 4.79708, 163.40746, -12);
        WeatherInfo cassidy  = new WeatherInfo("cassidy", -31.79995, -170.52448, 36);

        WeatherInfo[] listOfPlaces = {isabella, jack, cassidy};

        System.out.println(matt.CloseAndDangerous(listOfPlaces, 2000000, 30));

    }
}