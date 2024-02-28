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
                    System.out.println(userController.join(sc));
                    break;
                case "2":
                    System.out.println(userController.login(sc));
                    break;
                case "3":
                    userController.printUsersId();
                    System.out.println(userController.findUserById(sc));
                    break;
                case "4":
                    System.out.println(userController.updatePassword(sc));
                    break;
                case "5":
                    System.out.println(userController.deleteUser(sc));
                    break;
                case "6":
                    Map<String, UserDTO> users = userController.getUserMap();
                    users.forEach((k, v) -> {
                        System.out.printf("아이디: %s, 회원정보: %s", k, v);
                    });
                    System.out.println(users.size() + "");
                    break;
                case "7":
                    List<UserDTO> listName = userController.findUsersByName(sc);
                    if(listName==null){
                        System.out.println("회원이 존재하지 않습니다.");
                    }
                    else{
                        for (UserDTO i : listName) {
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case "8":
                    List<UserDTO> listJob = userController.findUsersByJob(sc);
                    if(listJob==null){
                        System.out.println("회원이 존재하지 않습니다.");
                    }
                    else{
                        for (UserDTO i : listJob) {
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case "9":
                    System.out.println(userController.countUsers());
                    break;

            }

        }
    }
}
