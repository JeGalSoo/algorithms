import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

/***
 * 최적화 문제 중 최대값 구하기
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        두수를 입력 받아 큰 수 구하기
//        System.out.println("입력된 수 중에서 큰 수를 구하시오.");
//        int[] arr = {1,2};
//        if(arr[0]>arr[1]) {
//            System.out.println(arr[0] + "은" + arr[1] + "보다 크다");
//        }else{
//            System.out.println(arr[1] + "은" + arr[0] + "보다 크다");
//        }
//        for(int i = 0; i<2; i++){
//            System.out.println("자연수를 입력하세요.");
//            System.out.println(sc.next());
//        }
//        int[] arr = new int[2];
//        for(int i=0; i<arr.length; i++){
//            System.out.printf("숫자를 입력해 주세요");
//            arr[i] = sc.nextInt();
//        }
//        if(arr[0]>arr[1]) {
//            System.out.println(arr[0] + "은" + arr[1] + "보다 크다");
//        }else{
//            System.out.println(arr[1] + "은" + arr[0] + "보다 크다");
//        }


//      학생수를 입력 받아 1등의 이름과 점수 출력
        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오.");
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        int[] arr = new int[sc.nextInt()];
        String[] names = new String[arr.length];
        int max = 0;
        String student = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println("응시한 학생의 이름을 입력하세요");
            names[i] = sc.next();
            System.out.printf("점수를 입력해 주세요");
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                student = names[i];
            }
        }
        System.out.println("응시한 학생 중에 1등 이름 : " + student + ", 점수 : " + max + "입니다.");

//    max를 이용하여 최고점 찾기
//        int max = arr[0];
//        for(int i=0; i<arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i+1];
//            }
//        }
    }
}