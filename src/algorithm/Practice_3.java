package algorithm;

import java.util.ArrayList;

public class Practice_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;
        int num3;
        array.add(num1);
        array.add(num2);
        for (int i = 1; i < 100; i++) {
            num3 = num2 + num1;
            if (num3 >= 100) {
                break;
            }
            array.add(num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println(array);
    }
}
