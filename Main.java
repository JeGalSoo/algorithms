import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = sc.next();
        year = year.substring(2);
        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = sc.next();
        if (month.length()<2)month="0"+month;
        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = sc.next();
        if (day.length()<2)day="0"+day;
        System.out.print("성별을 입력해 주세요.(m/f):");
        String sex = sc.next();
        String random = String.format("%06d", (rand.nextInt(999999)+1));
        if (sex.equals("m")) {
            System.out.print(year + month + day + "-3" + random);
        } else {
            System.out.print(year + month + day + "-4" + random);
        }
    }
}