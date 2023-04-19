package ss14_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        System.out.println("Nhập lần lượt các phần tử");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        int pos, x;
        System.out.println("Mảng trước khi sắp xếp" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            System.out.println("Chọn phần tử thứ " + (i + 1) + " để làm mốc sắp xếp");
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println("Dãy được sắp xếp tại phần tử thứ " + (i + 1));
            System.out.println(Arrays.toString(array));
        }
    }
}
