package com.bizshare.differentmodelexample;

/**
 * Created by Rakesh.Kumar on 23-03-2018.
 */

public class User {

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String name;
    String email;
}
