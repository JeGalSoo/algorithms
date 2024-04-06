package beak;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= num; i++) {
            int price = sc.nextInt();
            int num1 = sc.nextInt();
            a = a + price * num1;
        }
        if (a == total) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }
}
