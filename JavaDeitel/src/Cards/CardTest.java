package Cards;

/**
 * Created by smrithi on 11/28/17.
 */
public class CardTest {

    public static void main(String[] args) {
        CardGame cg_obj = new CardGame();
        cg_obj.DeckOfCards();
        cg_obj.shuffleCards();

        for (int i = 1; i <= 52; i++)
           {
               System.out.printf("%-19s", cg_obj.dealCard());
             if (i % 4 == 0)
              System.out.println();
           }
    }
}
