package com.example.clotherapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clotherapp.R;
import com.squareup.picasso.Picasso;

public class Detail extends AppCompatActivity {

    ImageButton btnBack;
    Button decrease,increase,white,black,red,s,m,l,xl,xxl;
    ImageView img,heart;
    TextView name,price,quantity,description;

    boolean isHeart = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        controls();
        Intent get = getIntent();
        String imgpro = get.getStringExtra("image");
        String namepro = get.getStringExtra("name");
        Double pricepro = get.getDoubleExtra("price",0);
        String despro = get.getStringExtra("description");
        Picasso.with(this).load(imgpro)
                .resize(300, 300)
                .into(img);
        name.setText(namepro);
        price.setText("$ "+String.valueOf(pricepro));
        description.setText(despro);
        events();
    }

    public void controls()
    {
        btnBack = findViewById(R.id.btn_back_home);
        img = findViewById(R.id.img_product_detail);
        name = findViewById(R.id.tw_name_detail);
        price = findViewById(R.id.tw_price_detal);
        quantity = findViewById(R.id.tw_quantity_detail);
        description = findViewById(R.id.tw_description_detail);
        increase = findViewById(R.id.btn_increase);
        decrease = findViewById(R.id.btn_decrease);
        white = findViewById(R.id.btn_white);
        black = findViewById(R.id.btn_black);
        red = findViewById(R.id.btn_red);
        s = findViewById(R.id.btn_s);
        m= findViewById(R.id.btn_m);
        l = findViewById(R.id.btn_l);
        xl = findViewById(R.id.btn_xl);
        xxl = findViewById(R.id.btn_2xl);
        heart = findViewById(R.id.img_heart);
    }

    public void events()
    {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(quantity.getText().toString());
                sl++;
                quantity.setText(String.valueOf(sl));
            }
        });

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(quantity.getText().toString());
                if(sl > 1)
                {
                    sl = sl -1;
                }
                quantity.setText(String.valueOf(sl));
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red.setTextColor(Color.WHITE);
                red.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                black.setTextColor(Color.BLACK);
                black.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                white.setTextColor(Color.BLACK);
                white.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                black.setTextColor(Color.WHITE);
                black.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                red.setTextColor(Color.BLACK);
                red.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                white.setTextColor(Color.BLACK);
                white.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                white.setTextColor(Color.WHITE);
                white.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                red.setTextColor(Color.BLACK);
                red.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                black.setTextColor(Color.BLACK);
                black.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.setTextColor(Color.WHITE);
                s.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                m.setTextColor(Color.BLACK);
                m.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                l.setTextColor(Color.BLACK);
                l.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xl.setTextColor(Color.BLACK);
                xl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xxl.setTextColor(Color.BLACK);
                xxl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setTextColor(Color.WHITE);
                m.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                s.setTextColor(Color.BLACK);
                s.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                l.setTextColor(Color.BLACK);
                l.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xl.setTextColor(Color.BLACK);
                xl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xxl.setTextColor(Color.BLACK);
                xxl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setTextColor(Color.WHITE);
                l.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                m.setTextColor(Color.BLACK);
                m.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                s.setTextColor(Color.BLACK);
                s.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xl.setTextColor(Color.BLACK);
                xl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xxl.setTextColor(Color.BLACK);
                xxl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });
        xl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xl.setTextColor(Color.WHITE);
                xl.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                m.setTextColor(Color.BLACK);
                m.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                l.setTextColor(Color.BLACK);
                l.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                s.setTextColor(Color.BLACK);
                s.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xxl.setTextColor(Color.BLACK);
                xxl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });
        xxl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xxl.setTextColor(Color.WHITE);
                xxl.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                m.setTextColor(Color.BLACK);
                m.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                l.setTextColor(Color.BLACK);
                l.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                xl.setTextColor(Color.BLACK);
                xl.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                s.setTextColor(Color.BLACK);
                s.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isHeart)
                {
                    heart.setImageResource(R.drawable.heart_full);
                    Toast.makeText(getApplicationContext(),"Đã thích",Toast.LENGTH_SHORT).show();
                    isHeart = true;
                }else{
                    isHeart = false;
                    heart.setImageResource(R.drawable.heart_non);
                    Toast.makeText(getApplicationContext(),"Đã bỏ thích",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}