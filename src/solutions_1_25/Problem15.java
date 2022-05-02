package solutions_1_25;

import java.util.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        long[][] grid = new long[21][21];
        grid[0][0] = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                long v = 0;
                if (i > 0) v += grid[i - 1][j];
                if (j > 0) v += grid[i][j - 1];
                grid[i][j] = v;
            }
        }
        for (long[] i : grid) System.out.println(Arrays.toString(i));
        System.out.println(grid[grid.length - 1][grid.length - 1]);
    }
}
