package com.shua.likegank.data.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Home
 * Realm 要求必须有一个无参的构造函数
 */
public class Home extends RealmObject {

    @PrimaryKey
    public String _id;
    public String title;
    public String createdAt;
    public String type;
    public String url;
    public String who;

    public Home() {
    }

    public Home(String _id,
                String title,
                String createdAt,
                String type,
                String url,
                String who) {
        this._id = _id;
        this.title = title;
        this.createdAt = createdAt;
        this.type = type;
        this.url = url;
        this.who = who;
    }
}
