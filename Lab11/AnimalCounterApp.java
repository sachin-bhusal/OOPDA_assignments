package Lab11;

public class AnimalCounterApp 
{
    public static void count(Countable c, int maxCount) 
    {
        c.resetCount();
    
        String animalType = (c instanceof Sheep) ? "sheep" : c.getCountString().split(" ")[1];
    
        System.out.println("\nCounting " + animalType + "...");
        for (int i = 1; i <= maxCount; i++)
        {
            c.incrementCount();
            System.out.println(c.getCountString());
        }
    }

    public static void main(String[] args) 
    {
        Countable alligator = new Alligator();
        count(alligator, 3);

        Sheep sheep = new Sheep("Blackie");
        count(sheep, 2);
    }
}

