package me.github.k.ui.mine;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;
import me.github.k.R;
import me.github.k.base.BaseFragment;


public class MineFragment extends BaseFragment {

    public static MineFragment newInstance(){
        MineFragment mineFragment = new MineFragment();
        return mineFragment;
    }

    @Override
    protected int layoutResId() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
    }

    @Override
    protected void initEvents() {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
