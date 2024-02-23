package serviceImpl;

import model.UserDTO;
import service.KaupService;

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

        return String.valueOf(bmi);
    }
    @Override
    public String createBodyMass(String bmi) {
        double bmiN=Double.parseDouble(bmi);
        String result=null;

        if(bmiN<18.5){
            result="저체중";
        }else if(bmiN<23){
            result="정상";
        }else if(bmiN<25.00){
            result="과체중";
        }else{
            result="비만";
        }
        return result;
    }
}
