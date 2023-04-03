package ss1_introduction.excercise;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int n = number - 10;
            switch (n) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            switch (ones) {
                case 0:
                    break;
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int tens = (number - (hundreds * 100)) / 10;
            int ones = (number - (hundreds * 100) - (tens * 10)) % 10;
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred and ");
                    break;
                case 2:
                    System.out.print("two hundred and ");
                    break;
                case 3:
                    System.out.print("three hundred and ");
                    break;
                case 4:
                    System.out.print("four hundred and ");
                    break;
                case 5:
                    System.out.print("five hundred and ");
                    break;
                case 6:
                    System.out.print("six hundred and ");
                    break;
                case 7:
                    System.out.print("seven hundred and ");
                    break;
                case 8:
                    System.out.print("eight hundred and ");
                    break;
                case 9:
                    System.out.print("nine hundred and ");
                    break;
            }
            if (tens == 1) {
                switch (ones) {
                    case 1:
                        System.out.print("eleven");
                        break;
                    case 2:
                        System.out.print("twelve");
                        break;
                    case 3:
                        System.out.print("thirteen");
                        break;
                    case 4:
                        System.out.print("fourteen");
                        break;
                    case 5:
                        System.out.print("fifteen");
                        break;
                    case 6:
                        System.out.print("sixteen");
                        break;
                    case 7:
                        System.out.print("seventeen");
                        break;
                    case 8:
                        System.out.print("eighteen");
                        break;
                    case 9:
                        System.out.print("nineteen");
                        break;
                }
            } else {
                switch (tens) {
                    case 2:
                        System.out.print(" twenty ");
                        break;
                    case 3:
                        System.out.print(" thirty ");
                        break;
                    case 4:
                        System.out.print(" forty ");
                        break;
                    case 5:
                        System.out.print(" fifty ");
                        break;
                    case 6:
                        System.out.print(" sixty ");
                        break;
                    case 7:
                        System.out.print(" seventy ");
                        break;
                    case 8:
                        System.out.print(" eighty ");
                        break;
                    case 9:
                        System.out.print(" ninety ");
                        break;
                }
                switch (ones) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
        }
    }
}
