package aeroplanPcg;

public class Thing implements IGetWeight {

    private double height;
    private double length;
    private double width;
   
    //getters and setters and constructors
    
    public double GetHeight()
    {
        return height;
    }

    public void SetHeight(double value)
    {
        height = value;
    }

    public double GetLength()
    {
        return length;
    }

    public void SetLength(double value)
    {
        length = value;
    }

    public double GetWidth()
    {
        return width;
    }

    public void SetWidth(double value)
    {
        width = value;
    }

    public Thing(double height, double length, double width)
    {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double GetWeight()
    {
       return height * length * width * 2;
    }
}
