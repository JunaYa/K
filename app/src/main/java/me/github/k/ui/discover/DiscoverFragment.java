package me.github.k.ui.discover;

import android.view.View;

import me.github.k.R;
import me.github.k.base.BaseToolbarFragment;


public class DiscoverFragment extends BaseToolbarFragment {
    private static final String TAG = DiscoverFragment.class.getSimpleName();

    public static DiscoverFragment newInstance() {
        DiscoverFragment discoverFragment = new DiscoverFragment();
        return discoverFragment;
    }


    @Override
    protected int layoutResId() {
        return R.layout.fragment_discover;
    }

    @Override
    protected void initView(View view) {
        setToolbarTitle(TAG);
    }

    @Override
    protected void initEvents() {

    }


}
