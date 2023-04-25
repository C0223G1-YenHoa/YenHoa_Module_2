package ss18_string_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateTelephoneNumber {
    private static final String PATTERN_NUMBER= "^[0-9]{2}-0[0-9]{9}$";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your telephone number: ");
        String numbers=sc.nextLine();
        System.out.println(Pattern.matches(PATTERN_NUMBER,numbers));
    }
}
