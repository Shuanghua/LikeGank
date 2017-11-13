package com.shua.likegank.data;

import android.support.annotation.NonNull;

public class Category {

    private String text;

    public Category(@NonNull final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
