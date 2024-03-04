package view;

import model.User;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {

        System.out.println("아이디, 비밀번호, 비밀번호 확인, 이름, 주민등록 번호, 전화번호, 직업");

        User user=User.builder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .ssn(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        System.out.println("입력: "+user.toString());

    }

}
