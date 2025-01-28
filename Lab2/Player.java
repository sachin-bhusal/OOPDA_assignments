package Lab2;
import java.util.ArrayList;

public class Player
{
    public static void main(String[] args)
    {
        ArrayList<String> player = new ArrayList<>();
        player.add("Lionel Messi");
        player.add("Cristiano Ronaldo");

        System.out.println(player.get(1));
    }
}