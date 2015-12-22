/**
 * Created by eivhy on 20.12.2015.
 */
public class pe005 {

    public boolean divisibilityCheck(int n) {

        for (int e = 1; e <= 20; e++) {

            if (n % e != 0) return false;

        }

        return true;

    }

    public int run() {

        /*
        * Problem: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
        * */

        int n = 1;

        while(true) {

            if (divisibilityCheck(n) == true)break;

            else n++;

        }

        return n;

    }

}
