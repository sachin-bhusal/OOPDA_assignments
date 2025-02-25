package Lab11;


public class AnimalCounterApp 
{
    public static void countingAll(Countable c, int maxCount)
        { 
            c.resetCount();
            for(int i = 0; i < maxCount; i++)
            { 
                c.incrementCount(); 
                System.out.println(c.getCountString());
            }
            
            
        }

        public static void main(String[] args)
        { 
            Alligator alligator = new Alligator(); 
            System.out.println("\nAlligator Counting.....");
            AnimalCounterApp.countingAll(alligator, 2);
            System.out.println();
        
            System.out.println("Counting Sheep.....");
            Sheep sheep = new Sheep("Blackie"); 
            AnimalCounterApp.countingAll(sheep, 3);
        }
}        