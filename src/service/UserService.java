package service;

import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public interface UserService {
    public String addUsers();
    public String countUsers();
    public Map<String, UserDTO> getUsersList();
    public String searchUsersId(String sc);
    public void printUsersId();
    public String join(UserDTO user);
    public String login(Scanner sc);

}
