package me.github.k.ui.home;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import me.github.k.R;
import me.github.k.base.BaseViewHolder;
import me.github.k.model.Gank;


public class HomeViewHolder extends BaseViewHolder {

    TextView mName;

    public HomeViewHolder(View itemView) {
        super(itemView);
        mName = (TextView) itemView.findViewById(R.id.name);
    }

    public void setData(Gank gank) {
        mName.setText(gank.name);
    }
}
