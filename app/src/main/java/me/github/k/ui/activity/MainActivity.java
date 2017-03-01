package me.github.k.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.ContentFrameLayout;
import android.view.MenuItem;

import com.crashlytics.android.Crashlytics;

import butterknife.BindView;
import io.fabric.sdk.android.Fabric;
import me.github.k.R;
import me.github.k.base.BaseActivity;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_container)
    ContentFrameLayout mFrameLayout;
    @BindView((R.id.navigation))
    BottomNavigationView mBottomNavigationView;

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
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()){
            case R.id.action_home:

                break;
            case R.id.action_discover:

                break;
            case R.id.action_mine:

                break;
            default:
                break;
        }
        return false;
    }

    private void switchFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.main_container,fragment,fragment.getTag());
        transaction.commit();
    }
}
