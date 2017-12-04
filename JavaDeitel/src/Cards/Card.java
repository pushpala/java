package Cards;

/**
 * Created by smrithi on 11/28/17.
 */
public class Card {

    private String face;
    private String suit;

    public Card(String cardFace, String cardSuit){
        this.setFace(cardFace);
        this.setSuit(cardSuit);
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString(){
        return getFace() + " of " + getSuit();
    }


}
