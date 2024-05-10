import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = new StringBuilder(br.readLine()).reverse().toString();
            if(a.equals("DNE")){
                break;
            }else {
                System.out.println(a);
            }
        }
    }
}