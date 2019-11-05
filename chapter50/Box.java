public class Box
{
    private double length = 0;
    private double width = 0;
    private double height = 0;

    public Box (double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public Box(Box oldBox)
    {
        this.length = oldBox.length;
        this.width = oldBox.width;
        this.height = oldBox.height;
    }

    public Box biggerBox(Box oldBox)
    {
        return new Box( 1.25*oldBox.length(), 1.25*oldBox.width(), 1.25*oldBox.height());
    }
        
    public Box smallerBox(Box oldBox)
    {
        return new Box( 0.75*oldBox.length(), 0.75*oldBox.width(), 0.75*oldBox.height()); 
    }

    public double area()
    {
        return 2 * (faceArea() + topArea() + sideArea());
    }

    public double volume()
    {
        return this.length * this.width * this.height;
    }

    private double faceArea()
    {
        return this.length * this.width;
    }
    
    private double topArea()
    {
        return this.width * this.height;
    }
    
    private double sideArea()
    {
        return this.height * this.length;
    }

    public double length()
    {
        return this.length;
    }
    
    public double width()
    {
        return this.width;
    }
    
    public double height()
    {
        return this.height;
    }

    public boolean nests(Box box1, Box box2)
    {
        int trueness = 0;

        if (box1.length() > box2.length())
        {
            trueness += 1;
        }

        if (box1.width() > box2.width())
        {
            trueness += 1;
        }

        if (box1.height() > box2.height())
        {
            trueness += 1;
        }

        if (trueness > 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}