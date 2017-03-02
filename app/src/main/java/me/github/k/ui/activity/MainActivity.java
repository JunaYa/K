package me.github.k.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.widget.Toast;

import com.crashlytics.android.Crashlytics;

import butterknife.BindView;
import io.fabric.sdk.android.Fabric;
import me.github.k.R;
import me.github.k.base.BaseActivity;
import me.github.k.ui.fragment.DiscoverFragment;
import me.github.k.ui.fragment.HomeFragment;
import me.github.k.ui.fragment.MineFragment;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener, ViewPager.OnPageChangeListener {

    @BindView(R.id.navigation)
    BottomNavigationView mBottomNavigationView;
    @BindView(R.id.view_pager)
    ViewPager mViewPager;

    @Override
    protected int layoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
    }

    @Override
    protected void initEvents() {
        mViewPager.setAdapter(new Adapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(this);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.action_home:
                mViewPager.setCurrentItem(0, true);
                break;
            case R.id.action_discover:
                mViewPager.setCurrentItem(1, true);
                break;
            case R.id.action_mine:
                mViewPager.setCurrentItem(2, true);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        mBottomNavigationView.getMenu().getItem(position).setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public class Adapter extends FragmentStatePagerAdapter {
        Fragment[] mFragments = {HomeFragment.newInstance(), DiscoverFragment.newInstance(), MineFragment.newInstance()};

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.length;
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments[position];
        }
    }
}
