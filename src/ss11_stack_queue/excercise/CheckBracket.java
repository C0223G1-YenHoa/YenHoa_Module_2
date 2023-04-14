package ss11_stack_queue.excercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập biểu thức: ");
        String string=sc.nextLine();
        String[] array;
        array=string.split("");
        Stack<String> bStack=new Stack<>();
        // 2 .. Với mỗi ký hiệu sym trong đoạn (từ trái sang phải):
        for (String s: array) {
            // 2.1. Nếu sym là dấu ngoặc trái:
        if(s.equals("(")){
            // 2.1.1. Đưa sym vào bStack.
            bStack.push(s);
        }
        //2.2 Nếu sym là dấu ngoặc phải:
        else if(s.equals(")")){
            //2.2.1. Nếu bStack rỗng, return false.
                if (bStack.isEmpty()){
                    return false;
                }
                //2.2.2. Lấy dấu ngoặc ở bStack, đưa vào biến left.
                else if ()
        }
        }
    }
}
