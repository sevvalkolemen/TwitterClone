package com.nesneyonelimli.twitterclone.data;

import junit.framework.TestCase;

import org.junit.Test;

public class PostRepositoryFactoryTest extends TestCase {
    private PostRepositoryFactory postRepositoryFactory;

    public void setUp() throws Exception {
        super.setUp();
        postRepositoryFactory = new PostRepositoryFactory();
    }

    public void testGetInstance() {
        assert postRepositoryFactory.getInstance() instanceof PostRepository;
    }

    public void testGetInstanceEquals(){
        PostRepository postRepositoryOne = (PostRepository) postRepositoryFactory.getInstance();
        PostRepository postRepositoryTwo = (PostRepository) postRepositoryFactory.getInstance();
        assert postRepositoryOne == postRepositoryTwo;
    }
}