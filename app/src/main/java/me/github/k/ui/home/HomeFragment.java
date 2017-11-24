package me.github.k.ui.home;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import butterknife.BindView;
import me.github.k.R;
import me.github.k.base.BaseToolbarFragment;
import me.github.k.ui.BannerAdapter;


public class HomeFragment extends BaseToolbarFragment {

    private static final String TAG = HomeFragment.class.getSimpleName();

    @BindView(R.id.banner)
    ViewPager mBannerViewPager;

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
        int[] images = {R.mipmap.banner_01, R.mipmap.banner_01};
        BannerAdapter mBannerAdapter = new BannerAdapter(images);
        mBannerViewPager.setAdapter(mBannerAdapter);
        mBannerAdapter.notifyDataSetChanged();

        HomeAdapter adapter = new HomeAdapter();

        mRecyclerView.setAdapter(adapter);
        adapter.setGanks(25);


//        initToolbar();
//        setToolbarTitle(TAG);


    }

    @Override
    protected void initEvents() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
