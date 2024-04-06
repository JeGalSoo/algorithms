package memberOOP;

public class Person {
    private String id;
    private String passWorld;
    private String passWorldCheck;
    private String name;
    private int sso;
    private int phoneNumber;
    private String address;
    private String job;


    private double height;
    private int weight;
    private double bmi;
    private String bodyMath;
    private int randomWeight;
    private double randomHeight;

//    public void creatRandomWeight() {
//        randomWeight = (int) (Math.random() * 69 + 30);
//    }
//
//    public int getRandomWeight() {
//        return randomWeight;
//    }
//
//    public void creatRandomHeight() {
//        randomHeight = (Math.random() * 0.5 + 1.5);
//    }
//
//    public double getRandomHeight() {
//        return randomHeight;
//    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWegith() {
        return this.weight;
    }

    public void creatBmi() {
        double bmi = 0.0;
        bmi = (weight / (height * height));
        this.bmi = bmi;
    }

    public double getBmi() {
        return this.bmi;
    }

    public void creatBodyMath() {
        if (bmi <= 18.5) {
            bodyMath = "저체중";
        } else if (bmi <= 23) {
            bodyMath = "정상";
        } else if (bmi <= 25) {
            bodyMath = "과체중";
        } else {
            bodyMath = "비만";
        }
    }

    public String getBodyMath() {
        return this.bodyMath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //카우프 지수에서 사용하는 생성자
    public Person(double height, int weight){
        this.height = height;
        this.weight = weight;
    }

   /* 회원가입에서 사용하는 생성자
    public Person(String id, String passWorld,
                  String passWorldCheck, String name,
                  int sso, int phoneNumber, String address,
                  String job) {
        this.id = id;
        this.passWorld = passWorld;
        this.passWorldCheck = passWorldCheck;
        this.name = name;
        this.sso = sso;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }*/
}
