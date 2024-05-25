package beak;

import java.util.Scanner;

public class No17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a%8){
            case 1:
                System.out.println(1);
                break;
            case 2:
            case 0:
                System.out.println(2);
                break;
            case 3:
            case 7:
                System.out.println(3);
                break;
            case 4:
            case 6:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
                break;
        }
    }
}
