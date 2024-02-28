package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, UserDTO> users;
    UserRepository userRepository;

    private UserServiceImpl() {
        this.users = new HashMap<>(); //this 생략 가능
        this.userRepository=new UserRepository();
    }
    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String addUsers() {
        Map<String,UserDTO> map=new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new UserBuilder()
                    .username(username)
                    .password("1")
                    .phoneNumber("010-0100-1121")
                    .job("개발자")
                    .build());
        }
        users=map;

        return  users.size()+"";
    }

    @Override
    public String countUsers() {
        return "회원수: "+users.size()+" ";
    }

    @Override
    public Map<String,UserDTO> getUsersList() {
        return users;
    }

    @Override
    public String searchUsersId(String username) {
        UserDTO tempUser=users.get(username);
        if(tempUser==null){
            return "존재하지 않는 id입니다.\n";
        }
        return "존재하는 id 입니다.\n";
    }

    @Override
    public void printUsersId() {
        System.out.println("\n-----회원목록-----");
        users.forEach((k,v)->{
            System.out.println(v.getUsername());
        });
        System.out.println("----------------");
    }

    @Override
    public String join(UserDTO userDTO) {
        users.put(userDTO.getUsername(),userDTO);
        return "회원가입 성공 - 총 회원수: "+users.size();
    }

    @Override
    public String login(Scanner sc) {
        String usernameTemp;
        String passwordTemp;

        System.out.println("---------------------\n"+
                "ID: ");
        usernameTemp=sc.next();
        System.out.println("---------------------\n"+
                "PASSWORD: ");
        passwordTemp=sc.next();

        for(UserDTO userDTO:users.values()){
            if(!usernameTemp.equals(userDTO.getUsername()))
                return "ID를 잘못 입력하셨습니다. 다시 로그인해주세요.";
            if(!passwordTemp.equals(userDTO.getPassword()))
                return "password를 잘못 입력하셨습니다.다시 로그인해주세요.";
        }
        return "정상적으로 로그인이 완료되었습니다.";
    }

}
