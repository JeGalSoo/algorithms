package beak;

import java.util.Scanner;

public class FindTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= num; i++) {
            a = a + i;
        }
        System.out.println(a);
    }
}
