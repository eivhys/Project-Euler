/**
 * Created by eivhy on 20.12.2015.
 */
public class pe009 {

    public int run() {

        /*
        * Problem: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        * a2 + b2 = c2. For example, 32 + 42 = 9 + 16 = 25 = 52.
        * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        * Find the product abc.
        * */

        double tmp;

        for (int a = 1; a <= 500; a++) {

            for (int b = a + 1; b <= 500; b++) {

                int c = 1000 - a - b;

                if (a * a + b * b == c * c) {

                    return a * b * c;

                }

            }

        }

        return -1;

    }

}
