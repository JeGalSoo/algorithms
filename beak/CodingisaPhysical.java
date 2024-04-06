package beak;
import java.util.Scanner;

public class CodingisaPhysical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple = sc.nextInt();
        for(int i=1; i<=multiple/4; i++){
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}
