package serviceImpl;

import builder.UserBuilder;
import controller.UserController;
import model.UserDTO;
import service.AuthService;
import service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private static UserService instance=new UserServiceImpl();
    Map<String, UserDTO> users;

    private UserServiceImpl(){
        this.users=new HashMap<>();
    }
    public static UserService getInstance(){
        return instance;
    }

    @Override
    public String addUsers() {
        return null;
    }

    @Override
    public String join(UserDTO user) {
        return null;
    }

    @Override
    public String login(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO findUserById(String username) {
        return null;
    }

    @Override
    public String updatePassword(UserDTO user) {
        return null;
    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDTO> getUserList() {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return null;
    }
}
