package beak;

import java.util.Scanner;

public class No10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int price = a*b;
        if (c >= price) {
            System.out.print(0);
        } else {
            System.out.print(price - c);
        }
    }
}
