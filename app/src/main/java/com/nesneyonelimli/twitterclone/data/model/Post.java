package com.nesneyonelimli.twitterclone.data.model;


public class Post{
    private int uid;
    private User user;
    private String description;

    public Post() { }

    public Post(String description) {
        this.description = description;
    }
}
