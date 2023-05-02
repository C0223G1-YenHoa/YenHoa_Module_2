package algorithm;

import java.util.Scanner;

public class Practice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi bất kì: ");
        String string = sc.nextLine();
        System.out.print("Nhập vào phần tử muốn đếm số lượng: ");
        String character = sc.nextLine();
        String[] arr = string.split("");
        int count = 0;
        for (String s : arr) {
            if (character.equals(s)) {
                count++;
            }
        }
        System.out.println("Phần tử " + character + " xuất hiện " + count + " lần.");
    }
}
