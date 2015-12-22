import java.util.ArrayList;

/**
 * Created by eivhy on 20.12.2015.
 */
public class pe010 {

    public long run() {

        long sum = 0;

        for (int i = 0; i < 2000000; i++) {

            if (isPrime.run(i)) sum += i;

        }

        return sum;

    }

}
