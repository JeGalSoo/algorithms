import java.util.Random;
import java.util.Scanner;

/**
 1. 서로 겹치지 않는 숫자 6개를 생성
 2. 각 숫자는 1 ~ 45 범위 내의 숫자
 3. 매번 실행 시 다른 숫자 출력
 4. 오름차순 정렬
 -> 랜덤수 : Math 사용
 결과)
 ----------------
 로또 번호
 ----------------
 2 11 25 27 35 38
 * */
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBuyLotto buy = new BuyLotto();
        ILottoDraw draw = new LottoDraw();
        ILottoMatch match = new LottoMatch();

        // 로또 구입

        int[] arr = new int[6];
        int[] arr1 = new int[6];
        arr = buy.buyLotto(arr, sc);
        arr1 = draw.createArrayWithoutDuplicates(arr1);
        arr1 = draw.sortAscending(arr1);
        draw.printLotto(arr,arr1);
        match.findSame(arr,arr1);
        match.rank(match.findSame(arr,arr1));

        // 구입한 로또와 추첨한 로또의 일치여부 체크

    }
}
interface IBuyLotto{ int[] buyLotto(int[] arr,Scanner sc);}
interface ILottoDraw{
    int createRandomNumber(int start, int end);
    int[] createArrayWithoutDuplicates(int[] arr);
    int[] sortAscending(int[] arr);
    void printLotto(int[] arr,int[] arr1);
}
interface ILottoMatch{
    int findSame(int[] originLotto, int[] myLotto);
    String rank(int count);
}
class BuyLotto implements IBuyLotto {

    @Override
    public int[] buyLotto(int[] arr, Scanner sc) {
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }
}

    class LottoDraw implements ILottoDraw {

        @Override
        public void printLotto(int[] arr, int[] arr1) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr1[i] + "\t");
            }
        }

        @Override
        public int[] sortAscending(int[] arr) {
            // 버블 정렬이 들어갈 부분
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }

        @Override
        public int[] createArrayWithoutDuplicates(int[] arr) {
            for (int i = 0; i < 6; i++) {
                int randomNumber = createRandomNumber(1,10);
                boolean check = false;
                for (int j = 0; j < 6; j++) {
                    if (arr[j] == randomNumber) {
                        // 중복되면  check 를 true 로 바꿔라..
                        check = true;
                    }
                }
                if (check == false) {
                    arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
                } else {
                    i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
                }
            }
            return arr;
        }

        @Override
        public int createRandomNumber(int start, int end) {
            Random a = new Random();
            return a.nextInt(end) + start;
        }

    }

    class LottoMatch implements ILottoMatch {
        @Override
        public int findSame(int[] originLotto, int[] myLotto) {
            int c = 0;
            for (int i = 1; i < originLotto.length; i++) {
                for (int j = 0; j < myLotto.length; j++) {
                    if (originLotto[i] == myLotto[j]) {
                        c += 1;
                    }
                }
            }
            return c;
        }

        @Override
        public String rank(int c) {
            switch (c) {
                case 3:
                    System.out.print("4등");
                    break;
                case 4:
                    System.out.print("3등");
                    break;
                case 5:
                    System.out.print("2등");
                    break;
                case 6:
                    System.out.print("1등");
                    break;
                default:
                    System.out.print("꽝");
                    break;
            }
            ;
            return null;
        }
    }