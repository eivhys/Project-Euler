/**
 * Created by eivhy on 20.12.2015.
 */
public class pe007 {

    public int run() {

        /*
        * Problem: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        * What is the 10 001st prime number?
        * */

        int n = 1;

        int primeCounter = 0;

        while (true) {

            if (isPrime.run(n) == true) {

                primeCounter += 1;

            }

            if (primeCounter == 10001) {

                break;

            }

            n += 1;

        }

        return n;

    }

}
