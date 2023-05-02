package algorithm;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = sc.nextLine();
        String[] arr = string.split("");
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(" ") && !newArr.contains(arr[i])) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (Objects.equals(arr[i], arr[j])) {
                        count++;
                    }
                }
                newArr.add(arr[i]);
                newArr.add(String.valueOf(count));
            }
        }
        System.out.println(newArr);
    }
}
