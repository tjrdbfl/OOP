package view;

import model.User;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {

    public static void main(Scanner sc) {

        String bmi,bodyMass;

        UtilService util= UtilServiceImpl.getInstance();

        User person=User.builder()
                .height(util.createRandomDouble(150,50))
                .weight(util.createRandomDouble(30,70))
                .build();

        KaupService kaup=KaupServiceImpl.getInstance();

        bmi=kaup.createBMI(person);
        bodyMass=kaup.createBodyMass(bmi);

        System.out.printf("================= BMI 계산기 =================\n" +
                "BMI: %s\n"+
                "bodyMass: %s\n"+
                "================= BMI 계산기 ================="
                ,bmi,bodyMass);

    }

}
