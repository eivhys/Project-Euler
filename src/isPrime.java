/**
 * Created by eivhy on 20.12.2015.
 */
public class isPrime {

    public static boolean run(long num) {

        if (num < 2) return false;

        if (num == 2 ) return true;

        if (num % 2 == 0) return false;

        for (int i = 3; i * i <= num; i += 2)

            if (num % i == 0) return false;

        return true;

    }

}
