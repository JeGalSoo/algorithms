package beak;

import java.util.Scanner;

import static java.lang.Math.pow;

public class NumberOfVerifications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += (int) pow(sc.nextInt(),2);
        }
        System.out.println(sum%10);
    }
}
