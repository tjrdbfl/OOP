package serviceImpl;

import model.KaupDTO;
import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance=new KaupServiceImpl();

    public KaupServiceImpl(){};

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public double createBMI(double height, double weight) {
        double bmi= weight / Math.pow( height /100,2);
        return bmi;
    }
    @Override
    public String createBodyMass(double bmi) {
        String bodyMass=null;

        if(bmi<18.5){
            bodyMass="저체중";
        }else if(bmi<23){
            bodyMass="정상";
        }else if(bmi<25.00){
            bodyMass="과체중";
        }else{
            bodyMass="비만";
        }
        return bodyMass;
    }
}
