import java.util.Scanner;

public class  MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=9; i++){
//            for(int a=1; a<=9; a++){
//                System.out.println(i + " * " + a + " = " + i*a);
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}