package Lab21;

import java.util.Scanner;

public class BaseballStatsApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Batting Average Calculator");

        boolean anotherPlayer = true;

        while (anotherPlayer) 
        {
            int atBats = getValidatedInt(scanner, "Enter number of times at bat: ", 1, 30);

            int[] results = new int[atBats];
            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

            for (int i = 0; i < atBats; i++) 
            {
                results[i] = getValidatedInt(scanner, "Result for at-bat " + (i + 1) + ": ", 0, 4);
            }

            double battingAverage = calculateBattingAverage(results);
            double sluggingPercentage = calculateSluggingPercentage(results);

            System.out.printf("Batting average: %.3f\n", battingAverage);
            System.out.printf("Slugging percent: %.3f\n", sluggingPercentage);

            System.out.print("\nAnother player? (y/n): ");
            String response = scanner.next();
            anotherPlayer = response.equalsIgnoreCase("y");
        }

        System.out.println("\nBye!");
        scanner.close();
    }

    private static int getValidatedInt(Scanner sc, String prompt, int min, int max) 
    {
        int number;
        while (true) 
        {
            System.out.print(prompt);
            if (sc.hasNextInt()) 
            {
                number = sc.nextInt();
                if (number >= min && number <= max)
                {
                    break;
                }
            } 
            else 
            {
                sc.next(); // discard invalid input
            }
            System.out.println("Error! Enter a number between " + min + " and " + max + ".");
        }
        return number;
    }

    private static double calculateBattingAverage(int[] atBats) 
    {
        int hits = 0;
        for (int result : atBats) 
        {
            if (result > 0) 
            {
                hits++;
            }
        }
        return (double) hits / atBats.length;
    }

    private static double calculateSluggingPercentage(int[] atBats) 
    {
        int totalBases = 0;
        for (int result : atBats) 
        {
            totalBases += result;
        }
        return (double) totalBases / atBats.length;
    }
}
