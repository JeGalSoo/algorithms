package beak;

import java.util.Scanner;

public class No14470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println((a<0)?(-a*c)+d+(b*e):(b-a)*e);
    }
}
