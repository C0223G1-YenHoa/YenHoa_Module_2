package ss13_search_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String string = sc.nextLine();
        LinkedList<Character> arrMax = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > arrMax.size()) {
                arrMax.clear();
                arrMax.addAll(list);
            }
            list.clear();
        }
        String str = "";
        for (Character s : arrMax) {
            str += s;
        }
        System.out.println(str);
    }
}
