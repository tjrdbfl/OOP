package view;

import builder.KaupBuilder;
import model.KaupDTO;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        KaupDTO kaupDTO=new KaupBuilder()
                .height(sc.nextDouble())
                .weight(sc.nextDouble())
                .name(sc.next())
                .build();

        UtilService util=UtilServiceImpl.getInstance();

        double h=util.createRandomDouble(150,50);
        double w=util.createRandomDouble(30,70);

        KaupService kaupService=new KaupServiceImpl();

//        double bmi=kaupService.createBMI(kaupDTO.getHeight(), kaupDTO.getWeight());
//        String bodyMass=kaupService.createBodyMass(bmi);
//
//        System.out.println("================= BMI 계산기 =================");
////        System.out.println("이름: "+kaupDTO.getName());
////        System.out.println("키: " + kaupDTO.getHeight());
////        System.out.println("몸무게: " + kaupDTO.getWeight());
//        System.out.printf("BMI는 %.1f 입니다\n", bmi);
//        System.out.println(bodyMass + "입니다.");
//        System.out.println("================= BMI 계산기 =================");
    }
}
