package me.github.k.ui.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.github.k.R;
import me.github.k.base.BaseViewHolder;
import me.github.k.model.Gank;


public class HomeAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<Gank> mGanks;

    public HomeAdapter() {

    }

    public void setGanks(int count) {
        mGanks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Gank gank = new Gank();
            gank.id = i + "";
            gank.name = "item is " + i;
            mGanks.add(gank);
        }
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_gank, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        Gank gank = mGanks.get(position);
        ((HomeViewHolder) holder).setData(gank);
    }

    @Override
    public int getItemCount() {
        return mGanks == null ? 0 : mGanks.size();
    }


}
