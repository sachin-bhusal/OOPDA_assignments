package Final;

import java.util.*;

public class Hand 
{
    private List<Card> cards;

    public Hand() 
    {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) 
    {
        cards.add(card);
    }

    public int getTotalPoints() 
    {
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) 
        {
            total += card.getValue();
            if (card.getRank().equals("Ace")) 
            {
                aceCount++;
            }
        }

        // Adjust for Aces if over 21
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public List<Card> getCards() 
    {
        return cards;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) 
        {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
