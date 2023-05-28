package card;

import java.util.Random;
import java.util.Scanner;

/**
 * This class creates a magic hand of 7 cards with random Card objects and
 * prompts the user to select a card.
 * It then searches the array of cards for a match to the user's card.
 * This code can be used as a starting point for ICE 1.
 * 
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
           // Adding a hard-coded luckyCard object
        Card luckyCard = new Card();
        luckyCard.setValue(7);  // Set the card value of your choosing
        luckyCard.setSuit("Hearts");  // Set the card suit of your choosing
    }
}
