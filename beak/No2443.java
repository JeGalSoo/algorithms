package beak;

import java.util.Scanner;

public class No2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1 ; i <= a; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = (2*a)-(i*2-1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
