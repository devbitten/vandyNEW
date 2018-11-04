package com.devbitten.staticpagethree;

import org.springframework.data.annotation.Id;

public class Account {

    @Id
    public String userName;

    public String firstName;
    public String lastName;
    public String password;
    public String numRatings;
    public String avgRating;
    public String review;
    public String picture; //TODO: figure out!

    public Account() {}

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                userName, firstName, lastName);
    }
}
