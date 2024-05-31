package com.example.clotherapp.ADAPTER;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.clotherapp.MODEL.Favourite;
import com.example.clotherapp.R;

import java.util.ArrayList;

public class FavouriteAdapter extends ArrayAdapter {
    Context context;
    int layout;
    ArrayList<Favourite> arrayList;

    public FavouriteAdapter(Context context, int layout, ArrayList<Favourite> arrayList) {
        super(context, layout,arrayList);
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Favourite fv = arrayList.get(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }

        ImageView img = convertView.findViewById(R.id.img_product_favourite);
        TextView name = convertView.findViewById(R.id.tw_name_favourite);
        TextView price = convertView.findViewById(R.id.tw_price_favourite);



        img.setImageResource(fv.getImg());
        name.setText(fv.getName());
        price.setText("$ " + String.valueOf(fv.getPrice()));




        return convertView;
    }
}
