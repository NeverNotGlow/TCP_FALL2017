/*
    Assignment: HW6 - Sorting Cards
    Author: [YOUR NAME]

    ***FOLLOW THE INSTRUCTIONS CLOSELY***

    Note: To make this file easier to read, you can turn on/off wordwrap in VSCode by pressing ALT+Z.

    Description:
        In your sixth assignment, you will show me that you understand the basics of OOP and sorting. There are 3 files in the zip folder you were given, each containing one class. The class Card has non-static instance variables value and suit. In Card you have to implement the isBiggerThan() function that is used to compare two cards. In the Deck class you have to implement the sort() function using any sorting algorithm you want. Use the isBiggerThan() function from Card to do your comparisons. Finally call the deck's sort function inside HW6's main function to sort the deck.

    Steps:
        1) Fill in the missing sections of code in HW6.java indicated by comments below.

        2) Fill in the missing sections of code in Card.java indicated by comments.

        3) Fill in the missing sections of code in Deck.java indicated by comments.

        4) Compile (you can use "java *.java" to compile all the files in the folder at once) and run the program (java HW6). Test it a couple times.

        5) Upload to Moodle your modified version of the files.

    Required files in your submission (don't zip; just upload each individually):
        - HW6.java that you have edited (NOT THE HW6.class)
        - Deck.java that you have edited (NOT THE Deck.class)
        - Card.java that you have edited (NOT THE Card.class)
*/

public class HW6
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        deck.shuffle();

        /*
            TODO HW6.java: call the Deck's sort() function on deck 
        */

        deck.printCards();
        testSort(deck);
    }

    public static void testSort(Deck deck)
    {
        for(int i = 0; i < deck.size() - 1; i ++)
        {
            Card lowerCard = deck.cardAt(i);
            Card higerCard = deck.cardAt(i + 1);
            if(!((lowerCard.value < higerCard.value && lowerCard.suit == higerCard.suit) || lowerCard.suit < higerCard.suit))
            {
                System.out.println("Deck NOT correctly sorted!");
                return;
            }
        }

        System.out.println("Deck correctly sorted!");
    }
}