package day8_workshop_deckofcards;

public class Card {
    private String number;
    private String suit;

    public Card(String number, String suit) {
        this.number = number;
        this.suit = suit;

        
    }

    @Override
    public String toString() {
        return "Card [number=" + number + ", suit=" + suit + "]";
    } 
}
