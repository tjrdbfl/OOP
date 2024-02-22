package view;

import builder.UserBuilder;
import model.UserDTO;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아이디, 비밀번호, 비밀번호 확인, 이름, 주민등록 번호, 전화번호, 직업");

        UserDTO user=new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                .ssn(sc.next())
                .phoneNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build();

        System.out.println(user.toString());

    }

}
