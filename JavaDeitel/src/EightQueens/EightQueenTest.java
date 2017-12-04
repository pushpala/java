package EightQueens;

/**
 * Created by smrithi on 12/1/17.
 */
public class EightQueenTest {
    public static void main(String[] args) {
        EightQueen eq_obj = new EightQueen();
        eq_obj.createBoard(8);
        eq_obj.placeQueens(0);
        eq_obj.displayBoard();
    }
}
