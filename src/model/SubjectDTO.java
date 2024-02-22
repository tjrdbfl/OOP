package model;

public class SubjectDTO {
    private int korean;
    private int math;
    private int english;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public SubjectDTO(int korean, int math, int english, String name){
        this.korean=korean;
        this.math=math;
        this.english=english;
        this.name=name;
    }

    public String toString(){
        return "SubjectDTO{" +
                "korean='" + korean + '\'' +
                ", math='" + math + '\'' +
                ", english='" + english + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
