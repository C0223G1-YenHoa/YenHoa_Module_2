package ss2_arrray.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to add: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the index you want to add: ");
        int index = Integer.parseInt(sc.nextLine());
        int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11};
        int[] arr = new int[array.length + 1];
        if (index <= -1 || index >= arr.length) {
            System.out.println("Unable to add element to array");
        } else {
            for (int i = 0; i < array.length; i++) {
                arr[i] = array[i];
            }
            for (int j = arr.length - 1; j > index; j--) {
                arr[j] = array[j - 1];
                arr[index] = number;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
