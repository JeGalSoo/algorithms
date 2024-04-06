package gradeOOP;

public class Person {
    private String name;
    private int koreaScore;
    private int englishScore;
    private int mathScore;
    private int average;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void creatKoreaScore() {
        koreaScore = (int)(Math.random()*100);
    }
    public int getKoreaScore() {
        return koreaScore;
    }
    public void creatEnglishScore() {
        englishScore = (int)(Math.random()*100);
    }
    public int getEnglishScore() {
        return englishScore;
    }
    public void creatMathScore() {
        mathScore = (int)(Math.random()*100);
    }
    public int getMathScore() {
        return mathScore;
    }
    public void creatAverage() {
        average = (koreaScore+englishScore+mathScore)/3;
    }
    public int getAverage() {
        return average;
    }
}
