package ss11_stack_queue.excercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần chuyển đổi: ");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        int integer = number / 2;
        int surplus = number % 2;
        boolean flag = true;
        do {
            stack.push(surplus);
            integer = integer / 2;
            System.out.println(surplus);
            surplus = integer % 2;
            if (integer == 0) {
                flag = false;
            }
        } while (flag);
        System.out.println(stack);
        int[] numbers = new int[stack.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
