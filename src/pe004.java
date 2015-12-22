/**
 * Created by eivhy on 20.12.2015.
 */
public class pe004 {

    public int run() {

        /*
        * Problem: A palindromic number reads the same both ways.
        * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        * Find the largest palindrome made from the product of two 3-digit numbers.
        * */

        StringBuffer reversed = null;

        int plndrm = 0;

        int N = 0;

        int[] answer = new int[2];

        String SN = null;

        String NS = null;

        for (int e = 99; e <= 999; e++) {

            for (int i = 99; i <= 999; i++) {

                N = e * i;

                SN = String.valueOf(N);

                reversed = new StringBuffer(SN);

                reversed.reverse();

                NS = String.valueOf(reversed);

                if (SN.equals(NS)) {

                    if (N >= plndrm) plndrm = N;

                }

            }

        }

        return plndrm;

    }

}
