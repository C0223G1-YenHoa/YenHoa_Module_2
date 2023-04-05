package ss3_arrray.excercise.method;

import java.util.Arrays;
import java.util.Scanner;

public class FindCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(findDivisor(number)));
    }

    public static int[] findDivisor(int num) {
        int count = 0;
        int[] array = new int[num];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                array[count] = i;
                count++;
            }
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}