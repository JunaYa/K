package me.github.k.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import me.github.k.R;

public abstract class BaseToolbarFragment extends BaseFragment {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.title)
    TextView mTitle;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    protected void initToolbar() {
        ((AppCompatActivity) getActivity()).setSupportActionBar(mToolbar);
    }

    protected void setToolbarTitle(String title) {
        mTitle.setText(title);
    }

    protected ActionBar getToolbar() {
        return ((AppCompatActivity) getActivity()).getSupportActionBar();
    }

}
