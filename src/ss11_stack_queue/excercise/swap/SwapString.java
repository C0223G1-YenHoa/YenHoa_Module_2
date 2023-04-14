package ss11_stack_queue.excercise.swap;

import java.util.Scanner;
import java.util.Stack;

public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = sc.nextLine();
        System.out.println("Chuỗi truyền vào: " + string);
        Stack<String> stack = new Stack<>();
        String[] mWord;
        mWord = string.split(" ");
        for (String s : mWord) {
            if (!s.equals(",")) {
                stack.push(s);
            }
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = stack.pop();
        }
        String str = String.join(" ", mWord);
        System.out.println("chuỗi sau khi đảo ngược: " + str);
    }

}
