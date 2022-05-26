package com.nesneyonelimli.twitterclone.ui.viewmodel;

import com.nesneyonelimli.twitterclone.data.model.User;

public interface Subscriber {
    void receive(User user);
}
