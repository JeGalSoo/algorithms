package beak;

import java.util.Scanner;

public class No2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int j = 0; j < a; j++) {
            for (int i = a-j; i < a; i++) System.out.print(" ");
            for (int i = j; i < a; i++)System.out.print("*");
            System.out.println();
        }
    }
}
