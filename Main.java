import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a += sc.nextInt();
        b += sc.nextInt();
        b += sc.nextInt();
        a += sc.nextInt();
        System.out.println(Math.min(a, b));
    }
}