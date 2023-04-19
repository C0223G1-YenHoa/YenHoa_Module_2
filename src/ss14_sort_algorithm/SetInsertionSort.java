package ss14_sort_algorithm;

public class SetInsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            int j;
            for (j = i + 1; j >= 0 && array[j] > number; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = number;
        }
    }
}
