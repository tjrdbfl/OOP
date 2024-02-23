package model;

public class SubjectDTO {
    private int korean;
    private int math;
    private int english;


    public int getKorean() {
        return this.korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public  int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return this.english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public SubjectDTO(int korean, int math, int english){
        this.korean=korean;
        this.math=math;
        this.english=english;
    }

    public String toString(){
        return "SubjectDTO{" +
                "korean='" + korean + '\'' +
                ", math='" + math + '\'' +
                ", english='" + english + '\'' +
                '}';
    }

}
