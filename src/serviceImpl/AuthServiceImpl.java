package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance=new AuthServiceImpl();
    Map<String, UserDTO> users;

    private AuthServiceImpl(){
        this.users=new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String login() {
        return null;
    }
    @Override
    public String addUsers(){
        Map<String, UserDTO> map=new HashMap<>();

        UtilService util=UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            String username=util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .passwordConfirm("1")
                            .name(util.createRamdomName())
                            .build());
        }
        users=map;
        return null;
    }
    @Override
    public String join(Scanner sc) {

        return null;
    }

    @Override
    public String count() {
        return users.size()+"";
    }

    @Override
    public UserDTO findUser(String userName) {
        UserDTO user=new UserBuilder().build();

        return user;
    }
    @Override
    public Map<String, UserDTO> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));

        return users;
    }

}
