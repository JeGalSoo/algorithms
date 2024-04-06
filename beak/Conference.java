package beak;

import java.util.Arrays;
import java.util.Scanner;

public class Conference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] arr = new int[cnt][2];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr);
//        int c = 1;
//        for (int i = 1, end = 0; i < arr.length; i++) {
//            if (arr[end][1] <= arr[i][0]) {
//                end = i;
//                c++;
//            }
//        }
        System.out.println(arr);
    }
}