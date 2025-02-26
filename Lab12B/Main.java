package Lab12B;

public class Main 
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();

        System.out.println("My name is: " + myDog.name);

        myDog.Eat();

        myDog.Bark();
    } 
}
