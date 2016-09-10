package com.matlb.domain.responseDomain;

import com.matlb.domain.User;

/**
 * Created by prassingh on 3/29/16.
 */
public class UserResponse extends BaseResponse {

    public UserResponse(String message) {
        super(message);
    }

    private boolean userCreated ;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isUserCreated() {
        return userCreated;
    }

    public void setUserCreated(boolean userCreated) {
        this.userCreated = userCreated;
    }
}
