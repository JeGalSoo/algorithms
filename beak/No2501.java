package beak;

import java.util.Scanner;

public class No2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i=1; i<=a; i++){
            cnt += (a%i==0)?1:0;
            if (cnt==b) {
                System.out.println(i);
                break;
            }
        }
        if(cnt<b) System.out.println(0);
    }
}
