package MidtermQ2;

class Square extends Shape 
{
    private double width;

    public Square(double width) 
    {
        this.width = width;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    @Override
    public double getArea() 
    {
        return width * width;
    }
}