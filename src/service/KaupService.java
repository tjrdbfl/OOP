package service;

import model.UserDTO;

public interface KaupService {


    public String createBMI(UserDTO usr);
    public String createBodyMass(String bmi);


}
