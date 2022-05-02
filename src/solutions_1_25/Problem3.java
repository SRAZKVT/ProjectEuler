package solutions_1_25;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        long number = 600851475143L;
        double sqrt = Math.sqrt(number);
        loop:
        for (int i = 2; i < sqrt; i++) {
            for (int n : primes) if (i % n == 0) continue loop;
            primes.add(i);
        }
        System.out.println(primes.stream().filter(n -> number % n == 0).max(Integer::compareTo));
    }
}
