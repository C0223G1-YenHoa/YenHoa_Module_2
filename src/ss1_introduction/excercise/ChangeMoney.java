package ss1_introduction.excercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double changeMoney = usd * vnd;
        System.out.println("Giá trị VND: " + changeMoney);
    }
}
