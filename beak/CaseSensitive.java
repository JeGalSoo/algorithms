package beak;

import java.util.Scanner;

public class CaseSensitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
            if (Character.isLowerCase(a.charAt(i))) System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
        }
    }
}
