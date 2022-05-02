package solutions_1_25;

public class Problem1 {
    public static void main(String[] args) {
        long v = 0;
        for (int i = 0; i < 1000; i++) if (i % 3 == 0 || i % 5 == 0) v += i;
        System.out.println(v);
    }
}
