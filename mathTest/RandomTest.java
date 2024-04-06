package mathTest;
import java.util.Scanner;
public class RandomTest {

    static int returnRandomNumber(){
        int randomNumber = (int)(Math.random()*100);
        System.out.printf("랜덤값 : %d", randomNumber);
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = returnRandomNumber();
        System.out.println("리턴된 값 : " + randomNumber);
    }
}
