package solutions_1_25;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem14 {
    private static final Map<Long /* Source */, Integer /* Size */> lut = new HashMap<>();
    public static void main(String[] args) {
        for (long i = 1; i < 1_000_000; i++) {
            int size = sizeOfPath(i);
            lut.put(i, size);
        }
        long i = lut.values().stream().max(Integer::compareTo).get();
        System.out.println(i);
        System.out.println(lut.keySet().stream().filter(k -> lut.get(k) == i).collect(Collectors.toList()));

    }

    private static int sizeOfPath(long i) {
        if (i == 1) return 0;
        long value = i;
        int size = 0;
        while (true) {
            if (lut.containsKey(value)) return size + lut.get(value);
            if (value % 2 == 0) value /= 2;
            else value = value * 3 + 1;
            size++;
        }
    }
}