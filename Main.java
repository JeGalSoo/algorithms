import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a/1000==1) {
            System.out.println(20);
        }else if (a/100==1) {
            System.out.println(10+(a%100));
        }else {
            System.out.println((a/10)+(a%10));
        }
    }
}