package KnightsTour;

import java.util.Scanner;

/**
 * Created by smrithi on 12/1/17.
 */
public class KnightsTour {

   int [][] board = new int[8][8];
   int currentRow = 0;
   int currentColumn = 0;
   int moveNumber;

   Scanner move = new Scanner(System.in);

   public void getMoveNumber(){
       System.out.printf("Enter move number 0-7:");
       moveNumber = move.nextInt();
   }
}
