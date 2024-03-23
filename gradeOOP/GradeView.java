package gradeOOP;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person ps = new Person();
        ps.creatKoreaScore();
        ps.creatEnglishScore();
        ps.creatMathScore();
        ps.creatAverage();
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        ps.setName(sc.next());
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오");


        System.out.println(" ============= 성적표 ==============");
        System.out.printf("이름 : ");
        System.out.println(ps.getName());
        System.out.printf("국어점수 : ");
        System.out.println(ps.getKoreaScore());
        System.out.printf("영어점수 : ");
        System.out.println(ps.getEnglishScore());
        System.out.printf("수학점수 : ");
        System.out.println(ps.getMathScore());
        System.out.printf("평균 점수: ");
        System.out.println(ps.getAverage());
    }
}