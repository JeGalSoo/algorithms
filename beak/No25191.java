package beak;

import java.util.Scanner;

public class No25191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int order = 0;
        order = b/2 + c;
        System.out.println(Math.min(order, a));
    }
}
