package serviceImpl;

import model.KaupDTO;
import model.UserDTO;
import service.KaupService;
import service.UtilService;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance=new KaupServiceImpl();

    public KaupServiceImpl(){};

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public String createBMI(UserDTO user) {
        double height=user.getHeight();
        double weight=user.getWeight();
        double bmi=0.0;

        bmi= weight / Math.pow( height /100,2);

        return Double.toString(bmi);
    }
    @Override
    public String createBodyMass(String bmi) {
        double bmiN=Double.parseDouble(bmi);
        String bodyMass=null;

        if(bmiN<18.5){
            bodyMass="저체중";
        }else if(bmiN<23){
            bodyMass="정상";
        }else if(bmiN<25.00){
            bodyMass="과체중";
        }else{
            bodyMass="비만";
        }
        return bodyMass;
    }
}
