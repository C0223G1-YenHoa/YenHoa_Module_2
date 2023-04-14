package ss11_stack_queue.excercise;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] array;
        array = string.split("");
        for (String s : array) {
            queue.add(s);
            stack.push(s);
        }
        boolean flag = false;
        for (String s : queue) {
            if (s.equals(stack.pop())) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Đó là chuỗi Palindrome");
        } else
            System.out.println("Đó không phải là chuỗi Palindrome");
    }
}
