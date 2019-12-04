public class WeatherInfo
{
    Geolocation geo;
    double temp;

    public WeatherInfo(String name, double lat, double lon, double temp)
    {
        this.geo = new Geolocation(name, lat, lon);
        this.temp = temp;
    }

    public double CloseAndDangerous(WeatherInfo[] locations, double distance, double targetTemp)
    {
        double countTotal = 0;
        double countSelective = 0;

        for (WeatherInfo place : locations)
        {
            if (this.geo.withinDistance(place.geo.getLatitude(), place.geo.getLongitude(), distance) && targetTemp < place.temp)
            {
                countSelective++;
            }

            countTotal++;
        }

        return countSelective / countTotal;
    }
}