package beak;

import java.util.Scanner;

public class SafariWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(abs(a-b));
    }
}
