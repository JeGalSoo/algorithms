package beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int b = 0;
        for (int i=0; i<4; i++){
            String[] a = br.readLine().split(" ");
            b += (Integer.parseInt(a[1])-Integer.parseInt(a[0]));
            if (max<b) max=b;
        }
        System.out.println(max);
    }
}
