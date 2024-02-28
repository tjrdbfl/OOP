package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private static UserService instance = new UserServiceImpl();
    Map<String, UserDTO> users;
    UserRepository userRepository;

    private UserServiceImpl() {
        this.users = new HashMap<>(); //this 생략 가능
        this.userRepository = new UserRepository();
    }

    public static UserService getInstance() {
        return instance;
    }

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();

        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username, new UserBuilder()
                    .username(username)
                    .password("1")
                    .name(util.createRamdomName())
                    .phoneNumber("010-0100-1121")
                    .job("개발자")
                    .build());
        }
        users = map;

        return users.size() + "";
    }
    @Override
    public String join(UserDTO userDTO) {
        users.put(userDTO.getUsername(), userDTO);
        return "회원가입 성공 - 총 회원수: " + users.size();
    }

    @Override
    public String login(UserDTO user) {
        String msg = "";
        UserDTO userInMap = users.get(user.getUsername());
        if (userInMap == null) {
            msg = "아이디 틀림";
        }
        if (userInMap.getPassword().equals(user.getPassword())) {
            msg = "로그인 성공";
        } else {
            msg = "비밀번호 틀림";
        }

        return msg;
    }
    @Override
    public UserDTO findUserById(String username) {
        return users.get(username);
    }
    @Override
    public String updatePassword(UserDTO userDTO) {
        users.get(userDTO.getUsername()).setPassword(userDTO.getPassword());
        return "비밀번호 변경 성공";
    }
    @Override
    public String deleteUser(String username) {
        users.remove(username);
        return "탈퇴 완료";
    }
    @Override
    public Map<String, UserDTO> getUserMap() {
        return users;
    }
    public List<UserDTO> findUsersByName(String name) {
        List<UserDTO> list=new ArrayList<>();
        for (UserDTO userDTO : users.values()) {
            if (userDTO.getName().equals(name)) {
                list.add(userDTO);
            }
        }
        return list;
    }

    @Override
    public List<UserDTO> findUsersByJob(String job){
        List<UserDTO> list=new ArrayList<>();
        for(UserDTO userDTO:users.values()){
            if(userDTO.getJob().equals(job))
                list.add(userDTO);
        }
        return list;
    }
    @Override
    public String countUsers() {
        return "회원수: " + users.size() + " ";
    }


    @Override
    public void printUsersId() {
        System.out.println("\n-----회원목록-----");
        users.forEach((k, v) -> {
            System.out.println(v.getUsername());
        });
        System.out.println("----------------");
    }
}
