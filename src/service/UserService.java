package service;

import model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public String addUsers();
    public String join(User user);
    public String login(User user);
    public String updatePassword(User userDTO);
    public String deleteUser(String username);
    public Map<String, User> getUserMap();
    public List<User> findUsersByName(String name);
    public String countUsers();
    public User findUserById(String username);
    public List<User> findUsersByJob(String job);
    public void printUsersId();

}
