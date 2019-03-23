package com.shua.likegank.ui.base;

import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import com.google.android.material.appbar.AppBarLayout;
import com.shua.likegank.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ToolbarActivity
 * Created by SHUA on 2017/3/6.
 */

public abstract class ToolbarActivity extends BaseActivity {

    @BindView(R.id.app_bar_layout)
    protected AppBarLayout mAppBarLayout;

    @BindView(R.id.toolbar)
    protected Toolbar mToolbar;

    abstract protected boolean addBack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbar(addBack());
        ButterKnife.bind(this);
    }

    private void initToolbar(boolean isAddBack) {
        mAppBarLayout = findViewById(R.id.app_bar_layout);
        if (mToolbar == null || mAppBarLayout == null) {
            throw new IllegalStateException(
                    getString(R.string.error_toolbar));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility
                    (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(isAddBack);
        mToolbar.setNavigationOnClickListener(v -> onBackPressed());

    }
}
