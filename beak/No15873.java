package beak;

import java.util.Scanner;

public class No15873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 10 == 0) {
            n /= 100;
            System.out.println(10 + n);
        } else {
            int a = n % 10;
            n /= 10;
            if (n == 10) {
                System.out.println(10 + a);
            } else {
                System.out.println(a + n);
            }
        }
//        Scanner sc = new Scanner(System.in); -- 앞에 알고리즘이랑 이거의 차이를 모르겠음
//        int a = sc.nextInt();
//        if (a/1000==1) {
//            System.out.println(20);
//        }else if (a/100==1) {
//            System.out.println(10+(a%100));
//        }else {
//            System.out.println((a/10)+(a%10));
//        }
    }
}
