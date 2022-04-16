import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static String[] getDeck() {
         String[] deck = new String[52];
        // add card Suites Here
        // Step 2 - Create a deck of cards with 2 string arrays; one for suites and one for rank.

        String[] suites = {
            "Hearts", "Diamonds", "Clubs", "Spades"
        };

        String[] ranks = {
            "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ",
            "9 of ", "10 of ", "Jack of ", "Queen of ", "King of ", "Ace of "
        };

        for(int i = 0; i < ranks.length; i++) { 
            for(int j = 0; j < suites.length;j++) { 
               Arrays.fill(deck, ranks[i] + suites[j] + "|"); // Fills the deck with ranks and suites.
               // System.out.println(deck[1]); // Successful test of the fill method
            }
        }
        return deck;
    }

    private static void displayCards(String[] cards) {
        // add code that displays cards here
    }

    private static void shuffleDeck(String[] deck) {
        int randomIndex = (int) (Math.random() * deck.length-1);
        
        // add code that shuffles the deck here
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = new String[count];
        return hand;
    }
}