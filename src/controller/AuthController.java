package controller;

import model.UserDTO;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController{

    AuthService auth;

    public AuthController() {
        this.auth =AuthServiceImpl.getInstance();
    }

    public String login() {
        return auth.login();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String addUsers(){
        auth.addUsers();
        return null;
    }
    public UserDTO findUser(String username) {
        auth.findUser(username);
        return null;
    }
    public Map<String, UserDTO> getUserMap() {
        return auth.getUserMap();
    }
    public String count() {
        return auth.count();
    }


}
