package beak;

import java.util.Scanner;

public class No2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=1;j<2*n;j++) {
                if(j>=n-i && j<=n+i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                if(j> n+i) break;
            }
            System.out.println();
        }
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i=0; i<=a; i++) {
//            for (int j=i; j<a; j++) {
//                System.out.print(" ");
//            }
//            for(int k=0; k<i*2-1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
