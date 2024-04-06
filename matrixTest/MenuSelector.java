package matrixTest;

import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        switch(menu){
            case "0":
                System.out.println("종료");
                return;
            case "1":
                System.out.println("생성");
                break;
            case "2":
                System.out.println("수정");
                break;
        }
//        while (true){
//            System.out.println("[메뉴] 0.종료 1.생성 2.수정");
//            if (menu.equals("0")) {
//                System.out.println("종료");
//                return;
//            }else{
//                System.out.println("생성");
//                continue;
//            }
//        }
    }
}
