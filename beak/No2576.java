package beak;

import java.util.Scanner;

public class No2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 100;
        for (int i=0; i<7; i++){
            int a = sc.nextInt();
            if (a%2!=0) {
                sum += a;
                min = Math.min(min,a);
            }
        }
        if (sum!=0){
            System.out.println(sum);
            System.out.println(min);
        }else {
            System.out.println(-1);
        }

    }
}
