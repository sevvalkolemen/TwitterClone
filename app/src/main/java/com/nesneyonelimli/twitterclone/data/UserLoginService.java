package com.nesneyonelimli.twitterclone.data;

public class UserLoginService {
    private String username;
    private String password;

    public boolean login(String username,String password){
        return this.username.equals(username) && this.password.equals(password);
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
