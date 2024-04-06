package beak;

import java.io.*;

public class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        for(int i = 1; i <= num; ++i) {
            int a = Integer.parseInt(bf.readLine());
            int b = Integer.parseInt(bf.readLine());
            int c = a + b;
            bw.write(Integer.toString(c)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
