package com.nesneyonelimli.twitterclone.data;

import com.nesneyonelimli.twitterclone.data.model.Post;

import java.util.ArrayList;

public class PostCacheDataSource {
    private ArrayList<Post> postList = new ArrayList<>();

    public void saveDataOnCache(ArrayList<Post> postList){
        this.postList.clear();
        this.postList.addAll(postList);
    }

    public ArrayList<Post> getDataFromCache(){
        return postList;
    }

    public boolean isEmpty(){
        return postList.size() == 0;
    }
}
