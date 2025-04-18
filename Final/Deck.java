package Final;

import java.util.*;

public class Deck 
{
    private List<Card> cards;
    private int currentCard;

    public Deck() 
    {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        int[] values =   {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for (String suit : suits) 
        {
            for (int i = 0; i < ranks.length; i++) 
            {
                cards.add(new Card(ranks[i], suit, values[i]));
            }
        }

        shuffle();
    }

    public void shuffle() 
    {
        Collections.shuffle(cards);
        currentCard = 0;
    }

    public Card dealCard() 
    {
        if (currentCard >= cards.size())
        {
            shuffle(); 
        }
        return cards.get(currentCard++);
    }
}
