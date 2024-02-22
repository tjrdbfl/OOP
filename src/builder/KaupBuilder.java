package builder;

import model.KaupDTO;
import model.UserDTO;

public class KaupBuilder {
    private double height;  //초기화 선언 x
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;


    public KaupBuilder height(double height){
        this.height=height;
        return this;
    }
    public KaupBuilder weight(double weight){
        this.weight=weight;
        return this;
    }
    public KaupBuilder name(String name){
        this.name=name;
        return this;
    }

    public KaupDTO build(){
        return new KaupDTO(height,weight,bmi,bodyMass,name);
    }

}
