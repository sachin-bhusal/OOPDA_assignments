package MidtermQ2;

class Rectangle extends Square 
{
    private double height;

    public Rectangle(double width, double height) 
    {
        super(width);
        this.height = height;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    @Override
    public double getArea() 
    {
        return getWidth() * height;
    }
}