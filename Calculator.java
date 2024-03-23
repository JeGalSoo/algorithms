import java.util.Scanner;

public class Calculator { //클래스라고 함
    public static void main(String[] args) {//메서드라고함
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요");
        String number1 = scanner.next();
        System.out.printf("두번째 숫자를 입력하세요");
        String number2 = scanner.next();
        System.out.printf("+,-,*,/ 중 하나를 입력하세요");
        String opcode = scanner.next();
        int result = 0;
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        /*if (opcode.equals("+")) {
            result = num1 + num2;
        } else if (opcode.equals("-")) {
            result = num1 - num2;
        } else if (opcode.equals("*")) {
            result = num1 * num2;
        } else if (opcode.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.printf("잘못된 연산기호 입니다.");
        }*/
        switch(opcode){
            case "+": result = num1 + num2;break;
            case "-": result = num1 - num2;break;
            case "*": result = num1 * num2;break;
            case "/": result = num1 / num2;break;
            default:
                System.out.println("잘못된 연산자");
        }
        System.out.printf(num1 + "+" + num2);
        System.out.println("결과 : " + result);
    }
}