<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 39573acc0bc029d309422e3e25a22856826dcfc4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int[] a=new int[3];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            System.out.printf(a[i]+" ");
=======
        int a = sc.nextInt();
        while(a>0){
            System.out.println(a);
            a-=1;
>>>>>>> 39573acc0bc029d309422e3e25a22856826dcfc4
        }
    }
}