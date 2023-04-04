package ss2_arrray.excercise;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột: ");
        int columns = Integer.parseInt(sc.nextLine());
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            array[i] = new int[columns];
            for (int j = 0; j < columns; j++) {
                System.out.println("Nhập phần thử thứ " + "[" + i + "]" + "[" + j + "] :");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Nhập vào cột bạn muốn tính tổng: ");
        int column = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int[] i : array) {
            sum += i[column];
        }
        System.out.println("Tổng của cột thứ " + column + " là " + sum);
    }
}
