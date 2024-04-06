package beak;
import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int price = 0;
        if(arr[0]==arr[1]){
            if(arr[0]==arr[2]){
                price = arr[0] * 1000 + 10000;
            }else {
                price = arr[0] * 100 + 1000;
            }
        }
        if(arr[0]!=arr[1]){
            if(arr[0]==arr[2]){
                price = arr[0] * 100 + 1000;
            }else if(arr[1]==arr[2]) {
                price = arr[1] * 100 + 1000;
            }else{
                price = max * 100;
            }
        }
        System.out.println(price);
    }
}