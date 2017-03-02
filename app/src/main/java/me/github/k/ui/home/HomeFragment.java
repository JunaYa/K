package me.github.k.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import me.github.k.R;
import me.github.k.base.BaseFragment;


public class HomeFragment extends BaseFragment {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Override
    protected int layoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView(View view) {
        HomeAdapter adapter = new HomeAdapter();
        mRecyclerView.setAdapter(adapter);
        adapter.setGanks(25);
    }

    @Override
    protected void initEvents() {

    }


}
