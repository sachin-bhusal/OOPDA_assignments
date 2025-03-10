package MidtermQ2;

abstract class Shape 
{
    public abstract double getArea();

    @Override
    public String toString() 
    {
        return "Area: " + getArea();
    }
}
