package Survey;

/**
 * Created by smrithi on 11/28/17.
 */
public class Responses {

    int [] votes = {1,2,3,4,5,3,2,2,1,2,2,3,5,4,3,3,4,2,4,3};
    int frequency [] =  new int[6];

    public void calAnswer(){
        System.out.println(frequency);
        for(int answer = 0; answer < votes.length; answer++ ){
            ++frequency[votes[answer]];
        }
    }
    public void displayResults(){
        for(int rating = 0; rating< frequency.length; rating++ ) {
            System.out.printf( "%6d%10d\n", rating, frequency[ rating ] );
        }
    }

}
