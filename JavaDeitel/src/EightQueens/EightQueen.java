package EightQueens;

/**
 * Created by smrithi on 12/1/17.
 */
public class EightQueen {

    boolean [][] board;
    boolean Queen = true;
    boolean Empty = false;
    int queens = 0;


    public void createBoard(int size){
        board = new boolean[size][size];
    }

    public void setQueen(int row, int col){
        board[row][col] = Queen;
        ++queens;
    }

    public void removeQueen(int row, int col){
        board[row][col] = Empty;
        --queens;
    }

    public void displayBoard(){
        for(int row = 0; row< board.length; row++){
            for(int col=0; col<board[row].length; col++){
                if(board[row][col] == true){
                    System.out.printf("| %s | ", "x");
                } else{
                    System.out.printf("| %s | ", "y");
                }
            }
            System.out.println();
        }
        System.out.println(queens);
    }

    public boolean placeQueens(int col){
        if(col >= board.length){
          return true;
        } else{
           boolean queenPlaced = false;
           int row= 0;

           while(!queenPlaced && row<board.length){
               if(queenUnderAttack(row,col)){
                    ++row;
               } else{
                   setQueen(row, col);
                   queenPlaced = placeQueens(col+1);
                   if(!queenPlaced){
                       removeQueen(row, col);
                       ++row;
                   }
               }
           }
            return queenPlaced;
        }
    }

    public boolean queenUnderAttack(int row, int col){
        boolean condition = false;

        for(int column = 0; column< board.length; column++){
            if(board[row][column] == true){
                condition = true;
            }
        }

        for(int rows =0; rows<board.length;rows++ ){
            if(board[col][rows] == true){
                condition = true;
            }
        }
        return condition;
    }

}
