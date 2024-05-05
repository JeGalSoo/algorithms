package beak;

import java.util.Scanner;

public class No10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b + c == 180) {
            if (a == b && a == c) {
                System.out.printf("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.printf("Isosceles");
            } else {
                System.out.printf("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
