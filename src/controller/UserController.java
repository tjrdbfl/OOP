package controller;

import model.UserDTO;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController{ //controller: model과 view를 가지고 있어야 한다.
    UserService userService;
    public UserController(){
        userService=UserServiceImpl.getInstance();
    }
    public String addUsers() {
        return userService.addUsers();
    }
    public String countUsers() {
        return userService.countUsers();
    }
    public Map<String,UserDTO> getUsersList() {
        System.out.println("전체 목록 출력");
        return userService.getUsersList();
    }
    public String searchUsersId(String userServicename) {
        return userService.searchUsersId(userServicename);
    }
    public void printUsersId() {
        userService.printUsersId();
    }
    public String join(UserDTO userDTO){
        return userService.join(userDTO);
    }
    public String login(Scanner sc){
        return userService.login(sc);
    }
    

}
