package beak;

import java.util.Scanner;
public class SevenDwarfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        for(int i=0; i<arr.length-1; i++){
            for(int a=i+1; a<arr.length; a++){
                if(arr[i]>arr[a]){
                    int temp = arr[i];
                    arr[i] = arr[a];
                    arr[a] = temp;
                }
            }
        }
        int num = 0;
        int num1 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int a = i+1; a < arr.length; a++) {
                if((total - arr[i]- arr[a])==100){
                    num = i;
                    num1 = a;
                }
            }
        }
        for(int b = 0; b < arr.length; b++){
            if(b!=num && b!=num1) {
                System.out.println(arr[b]);
            }
        }
    }
}