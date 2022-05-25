package com.nesneyonelimli.twitterclone.data;

import android.util.Log;

import com.nesneyonelimli.twitterclone.data.model.User;
import com.nesneyonelimli.twitterclone.ui.viewmodel.Subscriber;

import junit.framework.TestCase;

public class UserSubscriberTest extends TestCase {
    private ProfileDataPublisher publisher;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        publisher = new ProfileDataPublisher(new User());
    }

    public void testGetSubscribers(){
        publisher.addSubscriber(new Subscriber() {
            @Override
            public void receive(User user) {
                Log.d("Publisher Log","Publisher One Created!");
            }
        });
        publisher.addSubscriber(new Subscriber() {
            @Override
            public void receive(User user) {
                Log.d("Publisher Log","Publisher Two Created!");
            }
        });
        assert publisher.getSubscriberList().size() == 2;

    }

}
