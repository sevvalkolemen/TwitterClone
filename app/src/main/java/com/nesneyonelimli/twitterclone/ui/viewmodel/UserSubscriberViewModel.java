package com.nesneyonelimli.twitterclone.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.nesneyonelimli.twitterclone.data.model.User;

public class UserSubscriberViewModel extends ViewModel implements Subscriber{
    private MutableLiveData<User> liveData = new MutableLiveData<>();

    @Override
    public void receive(User user) {
        liveData.postValue(user);
    }
}
