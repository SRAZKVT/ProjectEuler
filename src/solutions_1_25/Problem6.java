package solutions_1_25;

public class Problem6 {
    public static void main(String[] args) {
        int sumsqu = 0;
        int squsum = 0;
        for (int i = 1; i <= 100; i++) {
            sumsqu += Math.pow(i, 2);
            squsum += i;
        }
        squsum = (int) Math.pow(squsum, 2);
        System.out.println(squsum - sumsqu);
    }
}
