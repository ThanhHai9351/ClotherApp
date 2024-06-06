package com.example.clotherapp.ADAPTER;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.clotherapp.MODEL.Favourite;
import com.example.clotherapp.R;

import java.util.List;

public class FavouriteAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Favourite> favourites;

    public FavouriteAdapter(Context context, int layout, List<Favourite> favourites) {
        this.context = context;
        this.layout = layout;
        this.favourites = favourites;
    }

    @Override
    public int getCount() {
        return favourites.size();
    }

    @Override
    public Object getItem(int position) {
        return favourites.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            holder = new ViewHolder();
            holder.img = convertView.findViewById(R.id.img_product_favourite);
            holder.name = convertView.findViewById(R.id.tw_name_favourite);
            holder.price = convertView.findViewById(R.id.tw_price_favourite);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Favourite favourite = favourites.get(position);
        holder.img.setImageResource(favourite.getImg());
        holder.name.setText(favourite.getName());
        holder.price.setText("$ " + favourite.getPrice());

        return convertView;
    }

    static class ViewHolder {
        ImageView img;
        TextView name;
        TextView price;
    }
}
