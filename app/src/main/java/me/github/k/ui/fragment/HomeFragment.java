package me.github.k.ui.fragment;

import android.view.View;

import me.github.k.R;
import me.github.k.base.BaseFragment;


public class HomeFragment extends BaseFragment {

    public static HomeFragment newInstance(){
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }
    @Override
    protected int layoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initEvents() {

    }


}
