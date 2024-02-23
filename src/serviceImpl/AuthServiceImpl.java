package serviceImpl;

import service.AuthService;
import service.KaupService;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance=new AuthServiceImpl();

    public AuthServiceImpl(){};

    public static AuthService getInstance(){
        return instance;
    }
    @Override
    public String login() {

        return null;
    }

    @Override
    public String join() {

        return null;
    }
}
