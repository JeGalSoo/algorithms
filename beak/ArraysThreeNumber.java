package beak;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            System.out.printf(a[i]+" ");
        }
    }
}
