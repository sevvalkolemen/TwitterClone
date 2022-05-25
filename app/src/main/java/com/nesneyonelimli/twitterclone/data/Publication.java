package com.nesneyonelimli.twitterclone.data;

import com.nesneyonelimli.twitterclone.data.model.User;
import com.nesneyonelimli.twitterclone.ui.viewmodel.Subscriber;

public interface Publication {
    void setUser(User user);
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void publish();
}
