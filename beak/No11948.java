package beak;

import java.util.Scanner;

public class No11948 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min1 = 100;
        int min2 = 100;
        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            sum+=a;
            min1 = Math.min(min1, a);
        }
        for(int i=0; i<2; i++){
            int a = sc.nextInt();
            sum+=a;
            min2 = Math.min(min2, a);
        }
        sum-=(min1+min2);
        System.out.println(sum);
    }
}
