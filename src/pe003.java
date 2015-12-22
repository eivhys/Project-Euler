/**
 * Created by eivhy on 20.12.2015.
 */
public class pe003 {

    public long run() {

        /*
        * Problem: The prime factors of 13195 are 5, 7, 13 and 29.
        * What is the largest prime factor of the number 600851475143?
        * */

        long number = 600851475143L;
        long largestFct = 0;
        long[] factors = new long[2];

        for (long i = 2; i * i < number; i++) {

            if (number % i == 0) {

                factors[0] = i;
                factors[1] = number / i;

                for (int k = 0; k < 2; k++) {

                    boolean isPrime = true;

                    for (long j = 2; j < factors[k]; j++) {

                        if (factors[k] % j == 0) {

                            isPrime = false;

                            break;

                        }

                    }

                    if (isPrime && factors[k] > largestFct) {

                        largestFct = factors[k];

                    }

                }

            }

        }

        return largestFct;

    }

}
