package me.github.k.ui.discover;

import android.view.View;

import me.github.k.R;
import me.github.k.base.BaseFragment;


public class DiscoverFragment extends BaseFragment {

    public static DiscoverFragment newInstance(){
        DiscoverFragment discoverFragment = new DiscoverFragment();
        return discoverFragment;
    }

    @Override
    protected int layoutResId() {
        return R.layout.fragment_discover;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initEvents() {

    }


}
