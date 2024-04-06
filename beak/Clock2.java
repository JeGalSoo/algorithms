import java.util.Scanner;

public class Clock2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int add = sc.nextInt();
        if(add>=60){
            int ho = add/60;
            int mi = add%60;
            hour = hour+ho;
            min = min+mi;
            if(min>=60) {
                min = min-60;
                hour = hour+1;
                if(hour>=24){
                    hour=hour-24;
                }
            }else {
                if (hour >= 24) {
                    hour = hour - 24;
                }
            }
        }else{
            min=min+add;
            if(min>=60){
                min = min-60;
                hour= hour+1;
                if (hour >= 24) {
                    hour=hour-24;
                }
            }else {
                if (hour >= 24) {
                    hour = hour - 24;
                }
            }
        }
        System.out.print(hour + " ");
        System.out.print(min);
    }
}