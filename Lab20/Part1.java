package Lab20;

import java.util.Scanner;
import java.util.function.Predicate;

public class Part1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> isMatch = input -> input.equalsIgnoreCase("Rowan");

        System.out.print("Enter a string to match with 'Rowan': ");
        String userInput = scanner.nextLine();

        if (isMatch.test(userInput)) 
        {
            System.out.println("Match found!");
        } 
        else 
        {
            System.out.println("No match.");
        }

        scanner.close();
    }
}
