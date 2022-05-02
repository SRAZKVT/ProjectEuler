package solutions_1_25;

import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        long value = 0;
        for (int i = 2; i < 2_000_000; i++) {
            int finalI = i;
            if (primes.stream().noneMatch(e -> finalI % e == 0)) {
                primes.add(i);
                value += i;
            }
        }
        System.out.println(value);
    }
}
