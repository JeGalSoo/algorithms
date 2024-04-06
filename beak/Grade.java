import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90){
            System.out.printf("A");
        }else if(a>=80){
            System.out.printf("B");
        }else if(a>=70) {
            System.out.printf("C");
        }else if(a>=60) {
            System.out.printf("D");
        }else {
            System.out.printf("F");
        }
    }
}