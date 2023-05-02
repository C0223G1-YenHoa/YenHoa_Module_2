package algorithm;

import java.util.ArrayList;

public class Practice_4 {
    public static boolean checkIsPrime(int i) {
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayPrime = new ArrayList<>();
        int i = 0;
        while (i < 1000000) {
            if (checkIsPrime(i)) {
                if ((i % 2 != 0) && (i % 3 == 0)) {
                    arrayPrime.add(i);
                }
            }
            i++;
        }
        System.out.println(arrayPrime);
    }
}
