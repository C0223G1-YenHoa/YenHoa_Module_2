package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_5 {
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
        System.out.print("Nhập vào 1 số: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < amount; i++) {
            for (int j = i + 1; j < amount; j++) {
                if (arr.get(i) + arr.get(j) == number) {
                    System.out.println(arr.get(i) + " vị trí thứ " + (i + 1) + " và " + arr.get(j) + " vị trí thứ " + (j + 1));
                }
            }
        }
    }
}
