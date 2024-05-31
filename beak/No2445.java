package beak;

import java.io.IOException;
import java.util.Scanner;

public class No2445 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N - 1; i >= 0; i--) {
            // 왼쪽 별 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
