public class Geolocation
{
    String name;
    double latitude;
    double longitude;
    private final double radiusKM = 6371;

    public Geolocation(String name, double lat, double lon)
    {
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
    }

    public Geolocation(double lat, double lon)
    {
        this(null, lat, lon );
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    public double getLongitude()
    {
        return this.longitude;
    }

    public void setLatitude(double lat)
    {
        this.latitude = lat;
    }

    public void setLongitude(double lon)
    {
        this.longitude = lon;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double distance(double lat, double lon)
    {
        double a = Math.pow(Math.sin(Math.abs((latitude * Math.PI / 180) - (lat * Math.PI / 180)) / 2.0), 2.0) + Math.cos((lat * Math.PI / 180)) * Math.cos((latitude * Math.PI / 180)) * Math.pow(Math.sin(Math.abs((longitude  * Math.PI / 180) - (lon * Math.PI / 180)) / 2.0), 2.0);
        double c = 2.0 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        System.out.println(a);

        return radiusKM * c;
    }

    public boolean withinDistance(double lat, double lon, double distance)
    {
        if (distance(lat, lon) <= distance)
        {
            return true;
        }

        return false;
    }
}