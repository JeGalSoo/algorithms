import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0 && b>0){
            System.out.printf("1");
        }else if(a<0 && b>0){
            System.out.printf("2");
        }else if(a<0 && b<0){
            System.out.printf("3");
        }else {
            System.out.printf("4");
        }
    }
}