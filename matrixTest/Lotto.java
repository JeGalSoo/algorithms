package matrixTest;

import java.util.Random;
//
//public class Lotto {
//    public static void main(String[] args) {
////        int[] arr = new int[6];
////        for (int i = 0; i < 6; i++) {
////            int a = (int) (Math.random() * 44 + 1);
////            boolean check = false;
////            for (int j = 0; j < 6; j++) {
////                if (arr[j] == a) {
////                    check = true;
////                }
////            }
////            if (check == false) {
////                arr[i]=a;
////            } else {
////                i--;
////            }
////        }
//
//
//        /*for(int i = 0; i<arr.length; i++){
//            arr[i]=(int)(Math.random()*44+1);
//        }
//        int cnt = 0;
//        while(cnt<1){
//            for(int i=0; i<=arr.length;i++) {
//                for (int a = 0; a < arr.length-1; a++) {
//                    if (arr[a] > arr[a + 1]) {
//                        int temp = arr[a];
//                        arr[a] = arr[a + 1];
//                        arr[a + 1] = temp;
//                    }
//                }
//            }
//            for(int i =0; i<arr.length-1; i++){
//                if(arr[i]==arr[i+1]){
//                    arr[i+1]=(int)(Math.random()*44+1);
//                }else{
//                    cnt++;
//                }
//            }
//        }*/
////        for(int i=0; i<=arr.length;i++) {
////            for (int a = 0; a < arr.length-1; a++) {
////                if (arr[a] > arr[a + 1]) {
////                    String temp = arr[a];
////                    arr[a] = arr[a + 1];
////                    arr[a + 1] = temp;
////                }
////            }
////        }
////        for(int i=0; i<=arr.length;i++) {
////            for (int a = 0; a < arr.length-1; a++) {
////                if (arr[a] > arr[a + 1]) {
////                    int temp = arr[a];
////                    arr[a] = arr[a + 1];
////                    arr[a + 1] = temp;
////                }
////            }
////        }
////        for(int i = 0; i<arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//    }
//}

import java.util.Random;

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
public class Lotto {
    public static void main(String[] args) {
        // 1 ~ 45 범위 내의 서로 겹치지 않는 숫자 6개를 생성
        int[] arr = new int[6];
        // 중복되지 않은 상태
        arr = createArrayWithoutDuplicates(arr);
        // 오름차순 정렬
        arr = sortAscending(arr);
        // 출력
        printLotto(arr);
    }

    private static void printLotto(int[] arr) {
        for(int i =0; i< arr.length; i++){
            System.out.printf("%d \t", arr[i]);
        }
    }

    private static int[] sortAscending(int[] arr) {
        // 버블 정렬이 들어갈 부분
        for(int i=0; i< arr.length;i++){
            for(int j=0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] createArrayWithoutDuplicates(int[] arr) {
        for(int i=0; i<6; i++){
            int randomNumber = createRandomNumber(1,45);
            boolean check = false;
            for(int j=0; j<6; j++){
                if(arr[j] == randomNumber){
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if(check==false){
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            }else{
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    private static int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end)+start;
    }


}