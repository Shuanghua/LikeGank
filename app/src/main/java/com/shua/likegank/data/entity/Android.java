package com.shua.likegank.data.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Android Entity
 * Created by SHUA on 2017/5/2.
 */

public class Android extends RealmObject {

    public String time;
    public String content;
    public String author;
    @PrimaryKey
    public String url;

    public Android() {
    }

    public Android(String time, String content, String author, String url) {
        this.time = time;
        this.content = content;
        this.author = author;
        this.url = url;
    }
}