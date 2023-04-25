package ss18_string_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String PATTERN= "^(A|P|C)[0-9]{4}(G|H|I|K)$";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your class name: ");
        String classes=sc.nextLine();
        System.out.println(Pattern.matches(PATTERN,classes));
    }
}
