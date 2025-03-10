package MidtermQ1;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("+++++++++++++++++++++++++++++++++++++");

        while (playAgain) 
        {
            playGame(sc);
            playAgain = getYesOrNo(sc, "Try again? (y/n): ");
        }

        System.out.println("\nBye - Come back soon!");
        sc.close();
    }

    public static void playGame(Scanner sc) 
    {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;  // Generates a number between 1 and 100
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("\nI'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");

        while (!guessedCorrectly) 
        {
            int guess = getInt(sc, "Enter number: ", 1, 100);
            attempts++;

            if (guess == numberToGuess) 
            {
                guessedCorrectly = true;
            } 
            else if (guess > numberToGuess + 10) 
            {
                System.out.println("Way too high! Guess again.");
            } 
            else if (guess < numberToGuess - 10) 
            {
                System.out.println("Way too low! Guess again.");
            } 
            else if (guess > numberToGuess) 
            {
                System.out.println("Too high! Guess again.");
            } 
            else 
            {
                System.out.println("Too low! Guess again.");
            }
        }

        System.out.println("You got it in " + attempts + " tries.");
        displayResultMessage(attempts);
    }

    public static void displayResultMessage(int attempts) 
    {
        if (attempts <= 3) 
        {
            System.out.println("Great work! You are a mathematical wizard.");
        } 
        else if (attempts <= 7) 
        {
            System.out.println("Not too bad! You've got some potential.");
        } 
        else 
        {
            System.out.println("What took you so long? Maybe you should take some lessons.");
        }
    }

    public static int getInt(Scanner sc, String prompt, int min, int max) 
    {
        int num;
        while (true) 
        {
            System.out.print(prompt);
            if (sc.hasNextInt()) 
            {
                num = sc.nextInt();
                if (num >= min && num <= max) 
                {
                    sc.nextLine(); // Consume newline
                    return num;
                } 
                else 
                {
                    System.out.println("Error! Number must be between " + min + " and " + max + ".");
                }
            } 
            else 
            {
                System.out.println("Error! Invalid number. Try again.");
                sc.next(); // Consume invalid input
            }
        }
    }

    public static boolean getYesOrNo(Scanner sc, String prompt) 
    {
        while (true) 
        {
            System.out.print(prompt);
            String input = sc.next().trim().toLowerCase();
            if (input.equals("y")) 
            {
                return true;
            } 
            else if (input.equals("n")) 
            {
                return false;
            } 
            else 
            {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            }
        }
    }
}

