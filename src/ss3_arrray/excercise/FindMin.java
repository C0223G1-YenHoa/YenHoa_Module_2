package ss2_arrray.excercise;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int numbers = Integer.parseInt(sc.nextLine());
        int[] array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            int number = Integer.parseInt(sc.nextLine());
            array[i] = number;
        }
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Min is " + min);
    }
}