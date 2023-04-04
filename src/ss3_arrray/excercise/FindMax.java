package ss2_arrray.excercise;

public class FindMax {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println("Max is " + max);
    }
}
