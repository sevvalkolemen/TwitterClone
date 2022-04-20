package com.nesneyonelimli.twitterclone.data.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Post extends RealmObject {
    @PrimaryKey private int uid;
    @Required private User user;
    @Required private String description;

    public Post(String description) {
        this.description = description;
    }
}
