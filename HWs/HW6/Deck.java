import java.util.*;
import javax.net.ssl.ExtendedSSLSession;

public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();
        createCards();
        shuffle();
    }

    public void sort()
    {
        int deckSize = cards.size();

        /*
            TODO Deck.java: Sort the deck in ascending order of suit and value 
            using the Card's isBiggerThan() function. Use any algorithm you want.
            You can use the ArrayList's remove() and add() methods or create a
            new ArrayList.
        */
    }

    public void shuffle()
    {
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--)
        {
            int j = random.nextInt(i);
            swap(i, j);
        }
    }

    private void swap(int i, int j)
    {
        Card temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    public void printCards()
    {
        for(int i = 0; i < cards.size(); ++i)
        {
            System.out.println(cards.get(i).toString());
        }
    }

    public Card cardAt(int index)
    {
        return cards.get(index);
    }

    public int size()
    {
        return cards.size();
    }

    private void createCards() 
    {
        for (int i = 0; i < 4; i++)
        {
            char c;
            
            if(i == 0)
                c = 'C';
            else if(i == 1)
                c = 'D';
            else if(i == 2)
                c = 'H';
            else
                c = 'S';

            for(int j = 1; j <= 13; j++)
            {
                cards.add(new Card(j, c));
            }
        }
    }
}