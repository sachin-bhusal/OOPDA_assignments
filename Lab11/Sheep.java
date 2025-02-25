package Lab11;

public class Sheep extends Animal implements Countable
{
    private String name;

    public Sheep(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name; 
    }

    public String getName()
    {
        return name;
    }

    public String getCountString()
    {
        return count + " " + name;
    }
}

