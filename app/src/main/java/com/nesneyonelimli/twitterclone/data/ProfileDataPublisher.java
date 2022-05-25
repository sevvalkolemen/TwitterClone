package com.nesneyonelimli.twitterclone.data;

import com.nesneyonelimli.twitterclone.data.model.User;
import com.nesneyonelimli.twitterclone.ui.viewmodel.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class ProfileDataPublisher implements Publication{
    private User user;
    private List<Subscriber> subscriberList;

    public ProfileDataPublisher(User user){
        this.user = user;
        subscriberList = new ArrayList<>();
    }

    @Override
    public void setUser(User user) {
        this.user = user;
        publish();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void publish() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.receive(this.user);
        }
    }

    public List<Subscriber> getSubscriberList(){
        return subscriberList;
    }
}
