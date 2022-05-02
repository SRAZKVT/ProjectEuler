package solutions_1_25;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();

        loop:
        for (int i = 2; primes.size() != 10001; i++) {
            for (int n : primes) if (i % n == 0) continue loop;
            primes.add(i);
        }
        System.out.println(primes.get(10000));
    }
}
