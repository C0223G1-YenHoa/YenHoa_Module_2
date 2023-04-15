package ss11_stack_queue.excercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = sc.nextLine();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stack1.push(string.charAt(i));
            } else if (string.charAt(i) == ')') {
                stack2.push(string.charAt(i));
            }
            if (stack2.size() > stack1.size()) {
                flag = false;
                break;
            }
        }
        if (flag && stack2.size() == stack1.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}