package com.nesneyonelimli.twitterclone.data;

public class UserRepository {
    private UserLoginService userLoginService = new UserLoginService();
    private UserSignupService userSignupService = new UserSignupService(userLoginService);

    public boolean loginAccount(String username,String password){
        return userLoginService.login(username,password);
    }

    public boolean signupAccount(String username,String password){
        return userSignupService.createAccount(username,password);
    }
}
