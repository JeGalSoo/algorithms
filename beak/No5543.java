package beak;

import java.util.Scanner;

public class No5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2000;
        int b = 2000;
        for(int i=0; i<3; i++){
            int c = sc.nextInt();
            if(a>c)a=c;
        }
        for(int i=0; i<2; i++){
            int c = sc.nextInt();
            if(b>c)b=c;
        }
        System.out.println((a+b)-50);
    }
}
