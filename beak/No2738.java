package beak;

import java.util.Scanner;

public class No2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] list = new int[a][b];
        for(int i=0; i<2; i++) {
            for (int k = 0; k < a; k++) {
                for (int j = 0; j < b; j++) {
                    list[k][j] += sc.nextInt();
                }
            }
        }
        for (int k = 0; k < a; k++) {
            for (int j = 0; j < b; j++) {
                System.out.print(list[k][j]+" ");
            }
            System.out.println();
        }
    }
}
