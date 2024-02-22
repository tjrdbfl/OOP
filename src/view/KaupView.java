package view;

import builder.KaupBuilder;
import builder.UserBuilder;
import model.KaupDTO;
import model.UserDTO;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        UtilService util= UtilServiceImpl.getInstance();

        UserDTO person=new UserBuilder()
                .height(sc.nextDouble())
                .weight(sc.nextDouble())
                .build();

        double h=util.createRandomDouble(150,50);
        double w=util.createRandomDouble(30,70);

        KaupService kaupService=new KaupServiceImpl();

        double bmi=kaupService.createBMI(person.getHeight(), person.getWeight());
        String bodyMass=kaupService.createBodyMass(bmi);

        System.out.println("================= BMI 계산기 =================");
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("BMI는 %.1f 입니다\n", bmi);
        System.out.println(bodyMass + "입니다.");
        System.out.println("================= BMI 계산기 =================");
    }

}
