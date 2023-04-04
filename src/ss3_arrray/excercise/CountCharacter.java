package ss2_arrray.excercise;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Dem so lan xuat hien cua ki tu cho truoc trong chuoi";
        char character = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của kí tự " + character + " trong chuỗi là: " + count + " lần");
    }
}
