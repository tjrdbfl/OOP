package serviceImpl;

import model.User;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance=new AuthServiceImpl();
    Map<String, User> users;

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
        Map<String, User> map=new HashMap<>();

        UtilService util=UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            String username=util.createRandomUsername();
            map.put(username, User.builder()
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
    public User findUser(String userName) {
        User user= User.builder().build();

        return user;
    }
    @Override
    public Map<String, User> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));

        return users;
    }

}
