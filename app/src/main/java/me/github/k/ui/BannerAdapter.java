package me.github.k.ui;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import me.github.k.R;


public class BannerAdapter extends PagerAdapter {

    private int[] data;

    public BannerAdapter(int[] data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data == null ? 0 : data.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) instantiateItem(container, position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.item_image, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_banner);
        if (position == 1) {
            imageView.setImageResource(R.mipmap.banner_01);
        }
        TextView tvIndicator = (TextView) view.findViewById(R.id.tv_indicator_banner);
        tvIndicator.setText("! " + position);
        container.addView(view);
        return view;
    }
}
