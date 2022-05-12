package com.nesneyonelimli.twitterclone.data;

import com.nesneyonelimli.twitterclone.data.model.Post;

import java.util.ArrayList;

public class PostRemoteDataSource {
    private ArrayList<Post> postList = new ArrayList<>();

    public ArrayList<Post> getDataFromRemoteDataSource(){
        getData();
        return postList;
    }

    private void getData() {
        postList.add(new Post("Post One"));
        postList.add(new Post("Post Two"));
        postList.add(new Post("Post Three"));
        postList.add(new Post("Post Four"));
        postList.add(new Post("Post Five"));
        postList.add(new Post("Post Six"));
        postList.add(new Post("Post Seven"));
        postList.add(new Post("Post Eight"));
        postList.add(new Post("Post Nine"));
        postList.add(new Post("Post Ten"));
        postList.add(new Post("Post Eleven"));
        postList.add(new Post("Post Twelve"));
        postList.add(new Post("Post Thirteen"));
        postList.add(new Post("Post Fourteen"));
        postList.add(new Post("Post Fifteen"));
        postList.add(new Post("Post Sixteen"));
    }
}
