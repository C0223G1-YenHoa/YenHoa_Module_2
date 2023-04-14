package ss11_stack_queue.excercise.swap;

import java.util.Scanner;
import java.util.Stack;

public class SwapInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử: ");
        int numbers = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= numbers; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            int number = Integer.parseInt(sc.nextLine());
            stack.push(number);
        }
        System.out.println("Mảng lúc đầu: " + stack);
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < numbers; i++) {
            stack1.push(stack.pop());
        }
        for (Integer s : stack1) {
            stack1.push(stack.pop());
            stack.push(s);
        }
        System.out.println("Mảng sau khi đảo ngược: " + stack);

    }

}
