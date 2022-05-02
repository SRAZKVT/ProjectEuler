package solutions_1_25;

public class Problem9 {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
                double c = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                if (c % 1 == 0) {
                    int cInt = (int) c;
                    if (i + j + cInt == 1000) System.out.println(i * j * cInt);
                }
            }
        }
    }
}
