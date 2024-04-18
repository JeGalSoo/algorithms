package beak;

import java.util.Scanner;

public class AiClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int mini = sc.nextInt();
        int sec = sc.nextInt();
        int a = sc.nextInt();
        sec = sec+a;
        mini +=sec/60;
        sec %= 60;
        hour += mini/60;
        mini %= 60;
        hour %=24;
        System.out.print(hour + " " + mini + " " + sec);
    }
}
