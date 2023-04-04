package ss2_arrray.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 6, 6, 7, 9, 0, 3, 4, 6, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to delete:");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
