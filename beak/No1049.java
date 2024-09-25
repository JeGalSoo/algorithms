package beak;

import java.util.Scanner;

public class No1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pack = 1000;
        int unit = 1000;

        for(int i=0; i<b; i++){
            pack = Math.min(pack,sc.nextInt());
            unit = Math.min(unit,sc.nextInt());
        }

        int min = Math.min((a/6)*pack+(a%6)*unit,a*unit);
        min = Math.min(min,(a/6+1)*pack);
        System.out.println(min);
    }
}
