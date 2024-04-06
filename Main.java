import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ID?");
        String id = scanner.next();
        System.out.printf("비번?");
        String password = scanner.next();
        System.out.printf("비번확인?");
        String confirm = scanner.next();
        System.out.printf("이름?");
        String name = scanner.next();
        System.out.printf("주민번호?");
        String ssn = scanner.next();
        System.out.printf("전화번호?");
        String phone = scanner.next();
        System.out.printf("주소?");
        String address = scanner.next();
        System.out.printf("직업?");
        String job = scanner.next();
        System.out.println("회원가입");
        System.out.println("ID : " + id);
        System.out.println("비번 : " + password);
        System.out.println("비번확인 : " + confirm);
        System.out.println("이름 : " + name);
        System.out.println("주민번호 : " + ssn);
        System.out.println("전화번호 : " + phone);
        System.out.println("주소 : " + address);
        System.out.println("직업 : " + job);
    }
}
