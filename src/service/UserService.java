package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    public String addUsers();
    public String join(UserDTO user);
    public String login(UserDTO user);
    public String updatePassword(UserDTO userDTO);
    public String deleteUser(String username);
    public Map<String, UserDTO> getUserMap();
    public List<UserDTO> findUsersByName(String name);
    public String countUsers();
    public UserDTO findUserById(String username);
    public List<UserDTO> findUsersByJob(String job);
    public void printUsersId();

}
