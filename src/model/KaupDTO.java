package model;

public class KaupDTO {
    private double height;  //초기화 선언 x
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public void createBMI(){
        this.bmi=weight/Math.pow(height/100,2);
    }
    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }


    public KaupDTO(double height, double weight,double bmi, String bodyMass, String name){
        this.height=height;
        this.weight=weight;
        this.bmi=bmi;
        this.bodyMass=bodyMass;
        this.name=name;
    }

    public String toString(){
        return "KaupDTO{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bmi='" + bmi + '\'' +
                ", bodyMass='" + bodyMass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
