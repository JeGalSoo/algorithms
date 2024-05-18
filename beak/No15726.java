package beak;

import java.util.Scanner;

public class No15726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        int n = (int)(a * b / c);
        int i = (int) (a / b * c);

        int max = Math.max(n, i);

        System.out.println(max);
    }
}
