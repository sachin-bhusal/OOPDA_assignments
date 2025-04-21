package Final;

public class BlackjackGame 
{
    private double totalMoney;
    private final double minBet = 5.0;
    private final double maxBet = 1000.0;
    private final double maxMoney = 10000.0;

    private Deck deck;
    private BlackjackIO io;

    public BlackjackGame() 
    {
        io = new BlackjackIO();
        deck = new Deck();
    }

    public void start() 
    {
        System.out.println("BLACKJACK!");
        System.out.println("Blackjack payout is 3:2");

        totalMoney = io.getStartingMoney(minBet, maxMoney);

        boolean play = true;
        while (play && totalMoney >= minBet) 
        {
            double bet = io.getBetAmount(minBet, maxBet, totalMoney);

            Hand player = new Hand();
            Hand dealer = new Hand();

            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());

            // Show dealer's one card
            System.out.println("\nDEALER'S SHOW CARD");
            System.out.println(dealer.getCards().get(0));

            // Show player's cards
            io.showCards("YOUR CARDS", player, true);

            // Player's turn
            while (player.getTotalPoints() < 21) 
            {
                String move = io.promptHitOrStand();
                if (move.equals("h")) 
                {
                    player.addCard(deck.dealCard());
                    io.showCards("YOUR CARDS", player, true);
                } 
                else 
                {
                    break;
                }
            }

            int playerPoints = player.getTotalPoints();
            if (playerPoints > 21) 
            {
                System.out.println("You busted!");
                totalMoney -= bet;
            } 
            else 
            {
                // Dealer's turn
                while (dealer.getTotalPoints() < 17) 
                {
                    dealer.addCard(deck.dealCard());
                }

                io.showCards("DEALER'S CARDS", dealer, true);
                int dealerPoints = dealer.getTotalPoints();

                if (dealerPoints > 21 || playerPoints > dealerPoints) 
                {
                    System.out.println("You win!");
                    totalMoney += bet;
                } 
                else if (playerPoints == dealerPoints) 
                {
                    System.out.println("You pushed.");
                } 
                else 
                {
                    System.out.println("Dealer wins.");
                    totalMoney -= bet;
                }
            }

            System.out.printf("Total money: $%.2f%n%n", totalMoney);

            if (totalMoney >= minBet) 
            {
                play = io.playAgainPrompt();
            } 
            else 
            {
                System.out.printf("You're below the minimum bet of $%.2f.%n", minBet);
            }
        }

        System.out.println("\nBye!");
    }
}
