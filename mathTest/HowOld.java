package mathTest;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

    public class HowOld {
        static int inputAge(Scanner sc) {
            System.out.println("몇살이니?");
            return sc.nextInt();
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = inputAge(sc);
            System.out.println("나이 : " + age);
        }
    }