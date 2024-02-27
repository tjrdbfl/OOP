package view;

import builder.UserBuilder;
import controller.AuthController;
import controller.UserController;
import model.UserDTO;

import java.util.List;
import java.util.Scanner;

public class AuthView {
    public static void main(Scanner sc) {
        AuthController ctrl = new AuthController();
        ctrl.addUsers();

        while(true) {
            System.out.println("[메뉴] 0-종료\n " +
                    "1-회원수\n " +
                    "2-회원목록\n " +
                    "3-ID검색");

            switch (sc.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원수 ===");
                    System.out.println(ctrl.count());
                    break;
                case "2":
                    System.out.println("=== 회원목록 ===");
                    ctrl.getUserMap();
                    break;
                case "3":
                    System.out.println("=== ID검색 ===");

                    break;

            }

        }
    }
}
