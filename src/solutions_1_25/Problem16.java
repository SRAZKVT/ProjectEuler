package solutions_1_25;

import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("2").pow(1000);
        int val = 0;
        for (char c : bi.toString().toCharArray()) val += c - '0';
        System.out.println(val);
    }
}
