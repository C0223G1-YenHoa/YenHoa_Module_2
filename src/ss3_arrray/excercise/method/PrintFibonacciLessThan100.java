package ss3_arrray.excercise.method;

public class PrintFibonacciLessThan100 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 0; i < 100; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (num3 > 100) {
                break;
            }
            System.out.print(num3 + ",");
        }
    }
}
