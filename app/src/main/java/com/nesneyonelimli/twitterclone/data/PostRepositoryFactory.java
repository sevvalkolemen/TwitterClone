package com.nesneyonelimli.twitterclone.data;

public class PostRepositoryFactory implements RepositoryFactory{
    private PostRepository repository;
    @Override

    public Repository getInstance() {
        if (repository == null){
            repository = new PostRepository();
        }
        return repository;
    }
}
