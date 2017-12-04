package SieveOfEratosthenes;

import java.util.Arrays;

/**
 * Created by smrithi on 12/1/17.
 */
public class Sieve {

    int n = 30;
    boolean[] testArr = new boolean[n];

    public Sieve(){
        Arrays.fill(testArr ,true);
    }

    public void findEven() {
        {
            for (int p = 2; p * p <= n; p++) {
                // If testArr[p] is not changed, then it is a testArr
                if (testArr[p] == true) {
                    // Update all multiples of p
                    for (int i = p * 2; i <= n; i += p)
                        testArr[i] = false;
                }
            }

            // Print all testArr numbers
            for (int i = 2; i <= n; i++) {
                if (testArr[i] == true)
                    System.out.print(i + " ");
            }
        }
    }
}
