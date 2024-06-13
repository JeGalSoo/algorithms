import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 64;
        int count = 0;
        int temp = 0;
        int result = a;
        while (true) {
            if (a == 64) {
                count++;
                break;
            }
            b /= 2;
            if (b <= a) {
                temp += b;
                count++;
                if (result == temp) {
                    break;
                }
                a -= b;
            }
        }
        System.out.println(count);
    }
}