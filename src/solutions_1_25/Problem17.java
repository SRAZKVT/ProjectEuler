package solutions_1_25;

import java.util.HashMap;
import java.util.Map;

// this is so horrible :D

public class Problem17 {
    private static final Map<Integer /* Source */, Integer/*Count*/> transMap = new HashMap<>();


    // i hate this fucking problem
    public static void main(String[] args) {
        initMap();
        int val = 0;
        for (int i = 1; i < 1001; i++) {
            int state = val;
            int v = i;
            System.out.println(i);
            if (v == 1000) {
                val += 11;
                continue;
            }
            else if (v >= 100) {
                val += transMap.get(String.valueOf(v).charAt(0) - '0') + 7;
                if (v % 100 != 0) {
                    val += 3;
                    v %= 100;
                }
                else continue;
            }
            if (v < 20) val += transMap.get(v);
            else val += transMap.get(v % 10) + transMap.get(v - v % 10);

            System.out.println(val - state);
            System.out.println();
        }
        System.out.println(val);
    }

    private static void initMap() {
        // i hate my life
        transMap.put(0, 0);
        transMap.put(1, 3);
        transMap.put(2, 3);
        transMap.put(3, 5);
        transMap.put(4, 4);
        transMap.put(5, 4);
        transMap.put(6, 3);
        transMap.put(7, 5);
        transMap.put(8, 5);
        transMap.put(9, 4);
        transMap.put(10, 3);
        transMap.put(11, 6);
        transMap.put(12, 6);
        transMap.put(13, 8);
        transMap.put(14, 8);
        transMap.put(15, 7);
        transMap.put(16, 7);
        transMap.put(17, 9);
        transMap.put(18, 8);
        transMap.put(19, 8);
        transMap.put(20, 6);
        transMap.put(30, 6);
        transMap.put(40, 5);
        transMap.put(50, 5);
        transMap.put(60, 5);
        transMap.put(70, 7);
        transMap.put(80, 6);
        transMap.put(90, 6);
    }
}
