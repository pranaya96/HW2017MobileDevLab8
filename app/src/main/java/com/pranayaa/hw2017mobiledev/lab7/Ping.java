package com.pranayaa.hw2017mobiledev.lab7;

/**
 * Created by pranayaa on 8/6/17.
 */

import com.google.firebase.database.DataSnapshot;

public class Ping {
    private String mUserName;
    private String mUserId;
    private Long mTimestamp;

    public Ping(String userName, String userId) {
        mUserName = userName;
        mUserId = userId;
        // Note we do not generate a timestamp...that's only generated by the server.
    }

    public Ping(DataSnapshot pingSnapshot) {
        mUserName = pingSnapshot.child("userName").getValue(String.class);
        mUserId = pingSnapshot.child("userId").getValue(String.class);
        mTimestamp = pingSnapshot.child("timestamp").getValue(Long.class);
    }

    public String getUserName() {
        return mUserName;
    }

    public Long getTimestamp() {
        return mTimestamp;
    }

    public String getUserId() {
        return mUserId;
    }
}
