package solutions_1_25;

public class Problem5 {
    public static void main(String[] args) {
        int current = 0;
                loop:
        while (true) {
            current++;
            for (int i = 1; i < 20; i++) if (current % i != 0) continue loop;
            System.out.println(current);
            break;
        }
    }
}
