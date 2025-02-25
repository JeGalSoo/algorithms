package beak;

import java.util.Scanner;

public class No2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int min = -1;
        for(int i = a; i <= b; i++){
            boolean chk = true;
            if (i<2) {
                continue;
            }
            for(int j=2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    chk = false;
                    break;
                }
            }
            sum += chk ? i : 0;
            min = chk && min == -1 ? i : min;
        }
        if(min != -1){
            System.out.println(sum);
        }
        System.out.println(min);
    }
}
