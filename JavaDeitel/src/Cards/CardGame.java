package Cards;


import java.security.SecureRandom;

/**
 * Created by smrithi on 11/28/17.
 */
public class CardGame {

    private Card[] deck;

    private int Number_of_cards = 52;

    private int currentCard;

    private SecureRandom randomNumber = new SecureRandom();

    public void DeckOfCards(){
        String[] faces = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[Number_of_cards];
        int cardIndex = 0;
            for (int i = 0; i < suits.length; i++) {
                for (int j = 0; j < faces.length; j++) {
                    deck[cardIndex] = new Card(suits[i], faces[j]);
                    cardIndex++;
                }
            }
        cardIndex = 0;
    }

    public void shuffleCards(){
        currentCard = 0;
        for(int i = 0; i< deck.length; i++){
            int j = randomNumber.nextInt(Number_of_cards);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

    }

    public Card dealCard(){
        if(currentCard <deck.length){
            return deck[currentCard++];
        } else{
            return null;
        }
    }
}
