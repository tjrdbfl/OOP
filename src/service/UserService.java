package service;

import model.UserDTO;

import java.util.List;

public interface UserService {
    String join(UserDTO user);
    String login(UserDTO user);
    UserDTO findUserById(String username);
    void updatePassword(UserDTO user);
    String deleteUser(String username);

    List<UserDTO> getUserList();
    List<UserDTO> findUsersByName(String name);
    List<UserDTO> findUsersByJob(String job);
    int countUsers();

}
