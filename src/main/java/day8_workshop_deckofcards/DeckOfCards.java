package day8_workshop_deckofcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class DeckOfCards implements Action
{
    public static void main( String[] args )
    {
        int numberRange = 13;
        int suitRange = 4;

        List<Card> deck = new ArrayList<>();

        // Start a loop to count down Suitrange and nunmberRange
        for (int i = 0; i < suitRange; i++) {
            String cardSuit = "";
            switch(i) {
                case 0:
                    cardSuit = "Club";
                    break;
                case 1:
                    cardSuit = "Diamond";
                    break;
                case 2:
                    cardSuit = "Heart";
                    break;
                case 3:
                    cardSuit = "Spade";
                    break;
              }
            for (int j = 0; j < numberRange; j++) {
                String cardNumber = "";
                // Create an individual card with the Card constructor

                // Write exceptions for 1 - Ace, 11 - Jack, 12 - Queen, 13 - King
                switch(j) {
                    case 0:
                        cardNumber = "Ace";
                        break;
                    case 10:
                        cardNumber = "Jack";
                        break;
                    case 11:
                        cardNumber = "Queen";
                        break;
                    case 12:
                        cardNumber = "King";
                        break;
                    default:
                        cardNumber = Integer.toString(j + 1);
                  }
                // Add the card into the deck after creating the card object
                Card newCard = new Card(cardNumber, cardSuit);
                deck.add(newCard);

            }
        }
        System.out.println(deck);
    }

    @Override
    public void shuffle() {
        
    }

    @Override
    public void deal() {

    }
}
