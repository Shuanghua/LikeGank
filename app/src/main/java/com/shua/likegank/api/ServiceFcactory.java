package com.shua.likegank.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ServiceFcactory
 * Created by SHUA on 2017/3/6.
 */

class ServiceFcactory {

    private final GankApi gankApiService;
    // https://gank.io/api/v2/data/category/Girl/type/Girl/page/1/count/10
    private final static String URL_GANK = "https://gank.io/api/v2/";

    ServiceFcactory() {
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofit gank = builder.baseUrl(URL_GANK)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        gankApiService = gank.create(GankApi.class);
    }

    GankApi getGankApiService() {
        return gankApiService;
    }
}
