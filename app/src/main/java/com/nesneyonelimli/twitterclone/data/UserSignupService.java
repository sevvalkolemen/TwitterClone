package com.nesneyonelimli.twitterclone.data;

public class UserSignupService {
    private UserLoginService savedUserAccount;

    public UserSignupService(UserLoginService savedUserAccount){
        this.savedUserAccount = savedUserAccount;
    }

    public boolean createAccount(String username,String password){
        savedUserAccount.setUsername(username);
        savedUserAccount.setPassword(password);
        return true;
    }
}
