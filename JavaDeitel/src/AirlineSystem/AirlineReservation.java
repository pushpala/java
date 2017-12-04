package AirlineSystem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by smrithi on 12/1/17.
 */
public class AirlineReservation {

    boolean[] seats = new boolean[10];
  //  Arrays.fill(seats, true);

    boolean seatOccupied = true;

    int seatType;

    Scanner type = new Scanner(System.in);

    public void setSeat() {
        System.out.printf("Enter seat type 1(Busniees) or 2(Economy): ");
        seatType = type.nextInt();
        if (seatType == 1) {
            bussinessSeat();
        } else if (seatType == 2) {
            economySeat();
        }
    }
    public void printPass(int seatNum, int seatType){
        System.out.print("\nBoarding Pass:  " + seatType + " class, Seat # " + seatNum +"\n\n");
    }

    public void bussinessSeat(){
        for(int i=1; i< 5 ;i++){
            if(seats[i] == false){
                seats[i] = seatOccupied;
                printPass(i, seatType);
                break;
            } else if(seats[5] == true){
                if(seats[10] == true){
                    System.out.println("full flight");
                } else {
                    System.out.println("first class filled. enter 2 for economy:");
                    int choice = type.nextInt();
                    if(choice == 2){
                        economySeat();
                    }
                    else{
                        System.out.println("next flight 3 hrs");
                    }
                }
            }
        }

    }

    public  void economySeat(){
        for(int i = 6; i<10; i++){
            if(seats[i] == false){
                seats[i] = seatOccupied;
                printPass(i, seatType);
                break;
            } else if(seats[10] == true) {
                System.out.println("full flight");
                System.out.println("next flight 3 hrs");
            }
        }

    }

}

