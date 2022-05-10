package com.nesneyonelimli.twitterclone.data;

import junit.framework.TestCase;

import org.junit.Test;

public class PostRepositoryFactoryTest extends TestCase {
    private PostRepositoryFactory postRepositoryFactory;
    private PostCacheDataSource postCacheDataSource;
    private PostRemoteDataSource postRemoteDataSource;

    public void setUp() throws Exception {
        super.setUp();
        postRepositoryFactory = new PostRepositoryFactory();
        postCacheDataSource = new PostCacheDataSource();
        postRemoteDataSource = new PostRemoteDataSource();
    }

    public void testGetInstance() {
        assert postRepositoryFactory.getInstance() instanceof PostRepository;
    }

    public void testGetInstanceEquals(){
        PostRepository postRepositoryOne = (PostRepository) postRepositoryFactory.getInstance();
        PostRepository postRepositoryTwo = (PostRepository) postRepositoryFactory.getInstance();
        assert postRepositoryOne == postRepositoryTwo;
    }

    public void testPostCacheDataSource(){
        assert postCacheDataSource.isEmpty();
    }

    public void testPostCacheDataSourceState(){
        if (postCacheDataSource.isEmpty()){
            postCacheDataSource.saveDataOnCache(postRemoteDataSource.getDataFromRemoteDataSource());
        }
        assert !postCacheDataSource.isEmpty();
    }
}