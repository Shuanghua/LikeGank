package com.shua.likegank;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * LikeGank application
 * Created by SHUA on 2017/3/31.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setLeakCanary();
        setRealm();
    }

    private void setLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) return;
        LeakCanary.install(this);
    }

    private void setRealm() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        //Realm.deleteRealm(config);
        Realm.setDefaultConfiguration(config);
    }
}