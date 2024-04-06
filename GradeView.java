import java.util.Scanner;

public class GradeView {
    static int returnNumClass(Scanner sc){
        System.out.println("반 수를 입력하세요");
        return sc.nextInt();
    }
    static int returnStudents(Scanner sc){
        int students = sc.nextInt();
        return students;
    }
//    static int returnArray(){
//        int[] scores = new int[returnStudents()];
//        return new int[students];
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numClass = returnNumClass(sc);
        int max = 0;
        int sum = 0;
        for (int i = 1; i <= numClass; i++) {
            System.out.printf(i + "반에서 응시한 학생수는 몇명입니까?");
            int students = returnStudents(sc);
            int[] scores = new int[students];
            for (int a = 1; a <= students; a++) {
                scores[i] = (int) (Math.random() * 100);
                sum += scores[i];
                if (max < scores[i]) {
                    max = scores[i];
                }
                if(a==students){
                    int avg = sum/students;
                    System.out.println(i + "반의 평균 점수 : " + avg + "입니다." + "최고점 : " + max);
                }
            }
        }
    }
}








//        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오.");
//        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
//        int num = sc.nextInt();
//        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
//        int num1 = sc.nextInt();
//        int[] scores = new int[num];
//        int sum = 0;
//        int max = 0;
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] = (int) (Math.random() * 100);
//            sum += scores[i];
//            if (max < scores[i]) {
//                max = scores[i];
//            }
//        }
//        int[] scores1 = new int[num1];
//        int sum1 = 0;
//        int max1 = 0;
//        for(int i=0; i<scores1.length; i++){
//            scores1[i] = (int) (Math.random() * 100);
//            sum1 += scores1[i];
//            if(max1<scores1[i]){
//                max1 = scores1[i];
//            }
//        }
//        int avg = sum/num;
//        int avg1 = sum1/num1;
//        System.out.println("1반의 평균 점수 : " + avg + "입니다." + "최고점 : " + max);
//        System.out.println("2반의 평균 점수 : " + avg1 + "입니다."+ "최고점 : " + max1);
//    }
//}