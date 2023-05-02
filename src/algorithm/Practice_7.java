package algorithm;


import java.util.Arrays;

import java.util.Scanner;

public class Practice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 1 chuỗi bất kì: ");
        String string = sc.nextLine();
        int charLength=string.length();
        Character[] characters = new Character[charLength];
        for (int i = 0; i < charLength; i++) {
            characters[i]=string.charAt(i);
        }
        Character temp;
        for (int i = 0; i < charLength; i++) {
            for (int j = 1; j < charLength; j++) {
                if(characters[j-1]>characters[j]){
                    temp=characters[j-1];
                    characters[j-1]=characters[j];
                    characters[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(characters));
    }
}
