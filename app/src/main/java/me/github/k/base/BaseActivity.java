package me.github.k.base;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    protected Unbinder mUnbinder;

    @LayoutRes
    protected abstract int layoutResId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutResId());
        mUnbinder = ButterKnife.bind(this);
        initEvents();
    }

    protected abstract void initEvents();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }

    protected void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
