package view;

import builder.UserBuilder;
import controller.UserController;
import model.UserDTO;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void main(Scanner sc) {
        UserController userController = new UserController();
        userController.addUsers();

        while (true) {
            System.out.print("\n[사용자메뉴]\n " +
                    "---------------------\n " +
                    "0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n " +
                    "5-탈퇴\n " +
                    "6-회원목록\n " +
                    "7-이름검색\n " +
                    "8-직업검색\n " +
                    "9-회원수\n" +
                    "---------------------\n" +
                    "입력: ");

            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    UserDTO userDTO = new UserBuilder()
                            .username("sdf")
                            .password("Sdf")
                            .phoneNumber("010-0101-0101")
                            .job("개발자")
                            .build();
                    System.out.println(userController.join(userDTO));
                    break;
                case "2":
                    System.out.println(userController.login(sc));
                    break;
                case "3":
                    userController.printUsersId();
                    System.out.print("검색하고 싶은 id: ");
                    System.out.println(userController.searchUsersId(sc.next()));
                    break;
                case "4":
                    System.out.println("4-비번변경");
                    break;
                case "5":
                    System.out.println("5-탈퇴");
                    break;
                case "6":
                    Map<String, UserDTO> users = userController.getUsersList();
                    users.forEach((k, v) -> {
                        System.out.printf("아이디: %s, 회원정보: %s", k, v);
                    });
                    break;
                case "7":
                    System.out.println("7-이름검색");
                    break;
                case "8":
                    System.out.println("8-직업검색");
                    break;
                case "9":
                    System.out.println(userController.countUsers());
                    break;

            }

        }
    }
}
