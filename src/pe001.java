/**
 * Created by eivhy on 20.12.2015.
 */
public class pe001 {

    public int run() {

        /*
         * Problem: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
         * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
         */

        int sum = 0;

        //
        boolean notYetAdded = false;

        for (int i = 0; i < 1000; i++) {

            if (i % 3 == 0 && notYetAdded == false) {

                sum += i;

                notYetAdded = !notYetAdded;

            }

            if (i % 5 == 0 && notYetAdded == false) {

                sum += i;

                notYetAdded = !notYetAdded;

            }

            notYetAdded = false;

        }

        return sum;

    }

}
