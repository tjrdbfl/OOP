package service;

import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login();

    Map<String, UserDTO> getUserMap();

    String addUsers();

    UserDTO findUser(String name);

    String join(Scanner sc);

    String count();
}
