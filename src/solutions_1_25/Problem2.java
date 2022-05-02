package solutions_1_25;

public class Problem2 {
    public static void main(String[] args) {
        int v = 0;
        int a = 1;
        int b = 0;
        while (a < 4_000_000) {
            int temp = b;
            b = a;
            a += temp;
            if (a < 4_000_000 && a % 2 == 0) v += a;
        }
        System.out.println(v);
    }
}
