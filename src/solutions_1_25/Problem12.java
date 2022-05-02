package solutions_1_25;

public class Problem12 {
    public static void main(String[] args) {
        int counter = 0;
        int current = 0;
        int value = 0;
        while (counter <= 500) {
            if (current % 100 == 0) System.out.println(current);
            counter = 0;
            current++;
            value += current;
            for (int i = 1; i < value + 1; i++) if (value % i == 0) counter++;
        }
        System.out.println(value);
    }
}
