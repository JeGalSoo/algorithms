package kaupTest;

public class KaupMain {

    static int returnWeight() {
        int weight = (int) (Math.random() * 69 + 30);
        return weight;
    }

    static double returnHeight() {
        double height = Math.random() * 0.5 + 1.5;
        return height;
    }

    static double returnbmi(){
        System.out.printf("bmi지수는 : %10.1f", (returnWeight() / (returnHeight() * returnHeight())));
        double bmi = (returnWeight() / (returnHeight() * returnHeight()));
        return 0;
    }

    public static void main(String[] args) {
//    카우프지수 구하는 프로그램을 작성해 주세요.(비만도측정) - 객체지향으로 작성해 주세요
//    BMI = 무게(kg)/키(m)^2 - 랜덤으로 입력(1.5~2미터사이)(30~99KG까지)
//    소수점 첫번째자리까지 표시.
        System.out.println(returnWeight());
        System.out.println(returnHeight());
        System.out.println(returnbmi());
    }
}