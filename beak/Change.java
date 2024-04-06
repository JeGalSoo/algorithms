package beak;

import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {500,100,50,10,5,1};
        int cnt = 0;
        int price = 1000-sc.nextInt();
        for(int i=0; i<arr1.length;i++){
            cnt += price/arr1[i];
            price %= arr1[i];
        }
        System.out.println(cnt);
    }
}