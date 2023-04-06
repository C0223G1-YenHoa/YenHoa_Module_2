package ss4_oop.excercise;


import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch stopwatch = new StopWatch();
        System.out.println("Enter a number you want to check: ");
        int number = Integer.parseInt(sc.nextLine());
        long start = stopwatch.getStart();
        System.out.println(StopWatchMain.isPrime(number));
        long end = stopwatch.getEndTime();
        long time = end - start;
        System.out.println(time);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
