package solutions_1_25;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> palindromics = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                String value = String.valueOf(i * j);
                StringBuilder bobTheBuilder = new StringBuilder();
                for (char c : value.toCharArray()) bobTheBuilder.insert(0, c);
                if (value.equals(bobTheBuilder.toString())) palindromics.add(i * j);
            }
        }
        System.out.println(palindromics.stream().max(Integer::compareTo));
    }
}
