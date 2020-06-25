package com.mednikarov.stockscreener.views.watchlist.recyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mednikarov.stockscreener.R;
import com.mednikarov.stockscreener.data.model.Stock;
import com.mednikarov.stockscreener.views.watchlist.recyclerview.viewholders.WatchlistViewHolder;

import java.util.ArrayList;
import java.util.List;

public class WatchlistAdapter extends RecyclerView.Adapter<WatchlistViewHolder> {
    private List<Stock> stockList;
    private WatchlistAdapter(){
        stockList = new ArrayList<>();
        stockList.add(new Stock("AAPL","Apple Inc.","16.06.2020",5,5,5,5));
        stockList.add(new Stock("GOOGL","Google Inc.","16.06.2020",6,6,6,6));
        stockList.add(new Stock("FCBK","Facebook Inc.","16.06.2020",7,7,7,7));
        stockList.add(new Stock("TSL","Tesla Inc.","16.06.2020",6,6,6,6));
    }
    @NonNull
    @Override
    public WatchlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_list_item,parent,false);

        return new WatchlistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WatchlistViewHolder holder, int position) {
        holder.setData(stockList.get(position));
    }

    @Override
    public int getItemCount() {
        return stockList.size();
    }

    public static WatchlistAdapter newInstance(){
        return new WatchlistAdapter();
    }
}