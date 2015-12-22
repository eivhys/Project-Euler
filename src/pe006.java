/**
 * Created by eivhy on 20.12.2015.
 */
public class pe006 {

    public int run() {

        /*
        * Problem: The sum of the squares of the first ten natural numbers is, 1^2 + 2^z2 + ... + 10^2 = 385
        * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 55^2 = 3025
        * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
        * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
        * */

        int sumOfSqrs = 0;
        int sqrOfSum = 0;
        int difference;

        for (int e = 1; e <= 100; e++) {

            sqrOfSum += e;

            sumOfSqrs += (Math.pow(e, 2));

        }

        sqrOfSum = (int) Math.pow(sqrOfSum, 2);

        difference = sqrOfSum - sumOfSqrs;

        return difference;

    }

}
