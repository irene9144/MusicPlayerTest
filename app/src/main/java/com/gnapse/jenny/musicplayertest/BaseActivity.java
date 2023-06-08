package com.gnapse.jenny.musicplayertest;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Observer;

public abstract class BaseActivity<V extends BaseViewModel> extends AppCompatActivity implements
        Observer {
    private V mViewModel;

    @LayoutRes
    public abstract int getLayoutId();
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initViewModel();

        this.mViewModel = mViewModel == null ? getViewModel() : mViewModel;

    }
    observ
}
