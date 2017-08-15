import javax.net.ssl.ExtendedSSLSession;

public class Card
{
    //1 is ace
    //11 is jack
    //12 is queen
    //13 is king
    public int value;
    public char suit;

    public Card(int value, char suit)
    {
        this.value = value;
        this.suit = suit;
    }

    public boolean isBiggerThan(Card other)
    {
        /*
            TODO Card.java: Return true if this card's suit is greater than (>) 
                the other card's suit (a char comparison). Return false if the
                other card's suit is greater than than ours. If the suits are
                the same, compare the card values and return true if our value
                is bigger, else return false if their value is bigger.
        */
    }

    public String toString()
    {
        String ret = "";
        if(value == 1)
            ret += "A ";
        else if(value == 11)
            ret += "J ";
        else if(value == 12)
            ret += "Q ";
        else if(value == 13)
            ret += "K ";
        else if(value == 10)
            ret += value;
        else
            ret += (value + " ");

        ret += " of ";

        if(suit == 'C')
            ret += "Clubs";
        else if(suit == 'D')
            ret += "Diamonds";
        else if(suit == 'H')
            ret += "Hearts";
        else
            ret += "Spades";

        return ret;
    }
}