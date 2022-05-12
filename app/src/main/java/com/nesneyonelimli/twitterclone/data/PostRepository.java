package com.nesneyonelimli.twitterclone.data;

import com.nesneyonelimli.twitterclone.data.model.Post;

import java.util.ArrayList;

public class PostRepository implements Repository{
    private PostCacheDataSource postCacheDataSource = new PostCacheDataSource();
    private PostRemoteDataSource postRemoteDataSource = new PostRemoteDataSource();

    public ArrayList<Post> getPostList(){
        if (postCacheDataSource.isEmpty()){
            postCacheDataSource.saveDataOnCache(postRemoteDataSource.getDataFromRemoteDataSource());
        }
        return postCacheDataSource.getDataFromCache();
    }
}
