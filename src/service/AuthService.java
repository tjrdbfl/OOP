package service;

import model.User;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String login();

    Map<String, User> getUserMap();

    String addUsers();

    User findUser(String name);

    String join(Scanner sc);

    String count();
}
