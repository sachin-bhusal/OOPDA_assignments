package Lab18;

import java.util.Scanner;
import java.util.Random;

public class blackjack 
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double startAmmount;
        double betAmmount;
        double totalMoney;
        String choice;
        System.out.println("BLACKJACK!");
        System.out.println("Blackjack payout is 3:2");
        System.out.println();
        do 
        {
            System.out.print("Starting money: ");
            startAmmount = scanner.nextDouble();
            if (startAmmount < 5 || startAmmount > 10000) 
            {
                System.out.println("Invalid amount. Please enter between 5 and 10,000.");
            }
        } 
        while (startAmmount < 5 || startAmmount > 10000);

        System.out.println();
        do
        {
            do
            {
                System.out.print("Bet Ammount: ");
                betAmmount = scanner.nextDouble();
                scanner.nextLine();

                if (betAmmount < 5 || betAmmount > 1000)
                {
                    System.out.println("Invalid bet. Bet ammount should be between 5 & 1000.");
                }

                if (betAmmount > startAmmount)
                {
                    System.out.println("You cannot bet more than your starting ammount");
                }
            }
            while (betAmmount < 5 || betAmmount > 1000 || betAmmount > startAmmount);

            int randomNum = random.nextInt(100);
            
            if (randomNum < 49)
            {
                System.out.println("You lost.");
                totalMoney = startAmmount - betAmmount;
                System.out.println("Total money :" + totalMoney);   
                startAmmount = totalMoney;             
            }

            else if (randomNum > 49 && randomNum < 59)
            {
                System.out.println("Both you and the dealer have the same number. It a draw");
                System.out.println("Total money :" + startAmmount);
                totalMoney = startAmmount;
            }

            else if (randomNum > 59 && randomNum < 94 )
            {
                System.out.println("You won.");
                totalMoney = startAmmount + betAmmount;
                System.out.println("Total money :" + totalMoney );
                startAmmount = totalMoney;
            }

            else
            {
                System.out.println("You got a Blackjack!");
                totalMoney = betAmmount*3/2 + startAmmount;
                System.out.println("Total money :" + totalMoney);
                startAmmount = totalMoney;
            }

            if(startAmmount <= 0 )
            {
                System.out.println("Gameover! You are out of money");
            } 

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.nextLine();
        }
        while(choice.equalsIgnoreCase("y"));
        System.out.println("Bye!");
        scanner.close();
    }
}
