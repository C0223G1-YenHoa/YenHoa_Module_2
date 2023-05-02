package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử trong mảng: ");
        int amount = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            System.out.print("Nhập vào phần tử thứ " + (i + 1) + ": ");
            int element = Integer.parseInt(sc.nextLine());
            arr.add(element);
        }
        Collections.sort(arr);
        System.out.println("Số lớn thứ hai: " + arr.get(amount - 2));
    }
}
