package me.github.k.ui.mine;

import android.view.MenuItem;
import android.view.View;

import me.github.k.R;
import me.github.k.base.BaseToolbarFragment;


public class MineFragment extends BaseToolbarFragment {

    private static final String TAG = MineFragment.class.getSimpleName();

    public static MineFragment newInstance() {
        MineFragment mineFragment = new MineFragment();
        return mineFragment;
    }

    @Override
    protected int layoutResId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        setToolbarTitle(TAG);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
