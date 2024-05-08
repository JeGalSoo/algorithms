package beak;

import java.util.Scanner;

public class No10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i=0; i<5; i++) sum+=sc.nextInt()==a?1:0;
        System.out.println(sum);
    }
}
