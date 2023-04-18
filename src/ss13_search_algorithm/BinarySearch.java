package ss13_search_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int numbers = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + " :");
            int number = Integer.parseInt(sc.nextLine());
            array.add(number);
        }
        System.out.println("Nhập vào số cần tìm: ");
        int value = Integer.parseInt(sc.nextLine());
        Collections.sort(array);
        System.out.println(binarySearch(array, array.get(0), array.size() - 1, value));
    }

    public static int binarySearch(ArrayList<Integer> array, int left, int right, int value) {
        if (right > left) {
            int mid = (left + right) / 2;
            if (array.get(mid) == value)
                return mid;
            if (array.get(mid) > value)
                return binarySearch(array, left, mid - 1, value);
            return binarySearch(array, mid + 1, right, value);
        }
        return -1;
    }

}
