package ss2_arrray.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng thứ nhất");
            array1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng thứ hai");
            array2[i] = Integer.parseInt(sc.nextLine());
        }
        int[] array3 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }
}
