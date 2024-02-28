package controller;

import model.UserDTO;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController{ //controller: model과 view를 가지고 있어야 한다.
    private Map<String, UserDTO> users;

    UserService user;

    public UserController(){
        this.users=new HashMap<>(); //생성자를 통해 호출할 시 객체 생성 및 메모리 할당
        this.user=UserServiceImpl.getInstance();
    }
    public String addUsers(){
        AuthServiceImpl.getInstance().addUsers();
        return null;
    }

    public String join(UserDTO user) {
        return null;
    }

    public String login(UserDTO user) {
        return null;
    }

    public UserDTO findUserById(String username) {
        return null;
    }

    public String updatePassword(UserDTO user) {
        return null;
    }

    public String deleteUser(String username) {
        return null;
    }

    public List<UserDTO> getUserList() {
        return null;
    }

    public List<UserDTO> findUsersByName(String name) {
        return null;
    }

    public List<UserDTO> findUsersByJob(String job) {
        return null;
    }

    public String countUsers() {
        return null;
    }

}
