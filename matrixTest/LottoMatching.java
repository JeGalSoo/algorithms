package matrixTest;

import java.util.Random;
import java.util.Scanner;
/*
로또 발급은 1~8까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다
로또 발급은 같다.
추가된 로직은 추첨된 로또이다.
두 로또의 일치여부에 따라
다음과 같은 메시지를 출력한다.
단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
1등 - 6개
2등 - 5개
3등 - 4개
4등 - 3개
꽝 - 2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[6][a];
        arr = createLotto(arr, a);
        printLotto(arr, a);
    }
    private static void printLotto(int[][] arr,int a) {
        int c = 0;
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[j][0] == arr[k][i]) {
                        c += 1;
                    }
                }
            }
            switch (c) {
                case 3:
                    System.out.print("4등입니다.");
                    break;
                case 4:
                    System.out.print("3등입니다.");
                    break;
                case 5:
                    System.out.print("2등입니다.");
                    break;
                case 6:
                    System.out.print("1등입니다.");
                    break;
                default:
                    System.out.print("꽝입니다.");
                    break;
            }
            c=0;
            for (int z = 0; z < arr.length; z++) {
                System.out.printf("%d \t", arr[z][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    private static int[][] createLotto(int[][] arr,int a) {
        for(int k=0; k<a;k++) {
            for (int i = 0; i < arr.length; i++) {
                int num = randomInt(1, 8);
                int judge = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j][k] == num) {
                        judge = 1;
                    }
                }
                if (judge == 0) {
                    arr[i][k] = num;
                } else {
                    i--;
                }
            }
        }
        return arr;
    }
    private static int randomInt(int start, int end) {
        Random a = new Random();
        return a.nextInt(end) + start;
    }
}