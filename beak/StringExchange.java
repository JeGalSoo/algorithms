package beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExchange {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt += str.charAt(i) == 'a' ? 1 : 0;
        }
        int min = str.length();
        for (int i = 0, a = 0; i < str.length(); i++, a = 0) {
            for (int j = 0; j < cnt; j++) {
                a += str.charAt((i + j) % str.length()) == 'b' ? 1 : 0;
            }
            min = Math.min(min, a);
        }
        System.out.println(min);
    }

}