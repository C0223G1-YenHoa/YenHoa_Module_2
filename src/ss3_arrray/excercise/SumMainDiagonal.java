package ss2_arrray.excercise;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh của ma trận hình vuông: ");
        int column = Integer.parseInt(sc.nextLine());
        int[][] array = new int[column][column];
        for (int i = 0; i < column; i++) {
            array[i] = new int[column];
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập phần thử thứ " + "[" + i + "]" + "[" + j + "] :");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("tổng của các số ở đường chéo chính là: " + sum);
    }
}
