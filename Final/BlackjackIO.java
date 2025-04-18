package Final;

import java.util.Scanner;

public class BlackjackIO 
{
    private Scanner sc;

    public BlackjackIO() 
    {
        sc = new Scanner(System.in);
    }

    public double getStartingMoney(double min, double max) 
    {
        double money = 0;
        while (true) 
        {
            System.out.printf("Starting money (%.2f - %.2f): ", min, max);
            try 
            {
                money = Double.parseDouble(sc.nextLine());
                if (money >= min && money <= max) 
                {
                    return money;
                }
            } 
            catch (NumberFormatException ignored) 
            {}
            System.out.printf("Invalid amount. Must be between $%.2f and $%.2f.%n", min, max);
        }
    }

    public double getBetAmount(double min, double max, double totalMoney) 
    {
        double bet = 0;
        while (true) 
        {
            System.out.print("Bet amount: ");
            try 
            {
                bet = Double.parseDouble(sc.nextLine());
                if (bet >= min && bet <= max && bet <= totalMoney) 
                {
                    return bet;
                }
            } 
            catch (NumberFormatException ignored) 
            {}
            System.out.printf("Invalid bet. Must be between $%.2f and $%.2f (or up to your total: $%.2f).%n", min, Math.min(max, totalMoney), totalMoney);
        }
    }

    public String promptHitOrStand() 
    {
        while (true) 
        {
            System.out.print("Hit or Stand? (h/s): ");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equals("h") || choice.equals("s")) return choice;
            System.out.println("Invalid input. Please enter 'h' or 's'.");
        }
    }

    public boolean playAgainPrompt() 
    {
        while (true) 
        {
            System.out.print("Play again? (y/n): ");
            String choice = sc.nextLine().trim().toLowerCase();
            if (choice.equals("y")) 
            return true;
            else if (choice.equals("n")) 
            return false;
            else 
            System.out.println("Invalid choice. Please enter 'y' or 'n'.");
        }
    }

    public void showCards(String label, Hand hand, boolean showPoints) 
    {
        System.out.println(label);
        System.out.println(hand);
        if (showPoints) 
        {
            System.out.println("POINTS: " + hand.getTotalPoints());
        }
    }
}
