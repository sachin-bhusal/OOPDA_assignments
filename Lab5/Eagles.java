package Lab5;

public class Eagles extends SuperBowl
{
    public void song()
    {
        System.out.println("Fly Eagles Fly!");
    }

    public static void main(String [] args)
    {
        Eagles eagles = new Eagles();
        eagles.song();
    }
}
