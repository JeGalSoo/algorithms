import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        int count = 0;
        for (String s : arr) {
            switch (s) {
                case "a": case "e": case "i": case "o": case"u":
                    count += 1;
            }
        }
        System.out.println(count);
    }
}