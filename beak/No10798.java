package beak;

import java.util.Scanner;

public class No10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[][] arr = new String[5][15];
        for(int i=0;i<5;i++) {
            String str = sc.next();

            if(str.length()>count)count = str.length();

            for(int j=0;j<str.length();j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        for(int i=0;i<count;i++) {
            for(int j=0;j<5;j++) {
                if(arr[j][i] != null)System.out.print(arr[j][i]);
            }
        }
    }
}
