package com.matlb.domain.requestDomain;

import com.matlb.domain.User;

import java.util.List;

/**
 * Created by prassingh on 9/25/16.
 */
public class FriendsPresentRequest {

    public FriendsPresentRequest() {

    }

    public FriendsPresentRequest(User user, List<Long> phoneNumbers) {
        this.user = user;
        this.phoneNumbers = phoneNumbers;
    }

    private User user;

    private List<Long> phoneNumbers;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
