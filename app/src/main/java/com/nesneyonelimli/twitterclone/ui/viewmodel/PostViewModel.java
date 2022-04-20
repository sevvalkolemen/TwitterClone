package com.nesneyonelimli.twitterclone.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import com.nesneyonelimli.twitterclone.data.PostRepository;
import com.nesneyonelimli.twitterclone.data.PostRepositoryFactory;

public class PostViewModel extends ViewModel {
    private final PostRepository repository;
    public PostViewModel(){
        PostRepositoryFactory postRepositoryFactory = new PostRepositoryFactory();
        this.repository = (PostRepository) postRepositoryFactory.getInstance();
    }


}
