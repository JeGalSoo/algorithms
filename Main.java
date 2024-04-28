import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        int d = (int) Math.ceil(b /sc.nextDouble());
        int e = (int) Math.ceil(c /sc.nextDouble());
        System.out.println((d>e)?a-d:a-e);
    }
}