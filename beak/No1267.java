package beak;

import java.util.Scanner;

public class No1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = 0;
        int m = 0;
        for (int i = 0; i < a; i++) {
            int K = sc.nextInt();
            y += ((K / 30) + 1) * 10;
            m += ((K / 60) + 1) * 15;
        }
        if (y == m) {
            System.out.println("Y M " + y);
        } else if (y < m) {
            System.out.println("Y " + y);
        } else {
            System.out.println("M " + m);
        }
    }
}
