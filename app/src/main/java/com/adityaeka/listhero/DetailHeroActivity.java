package com.adityaeka.listhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailHeroActivity extends AppCompatActivity {

    ImageView iVphotos;
    TextView tVname, tVrealname, tVdesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);


        tVname = findViewById(R.id.tv_detail_name);
        tVrealname = findViewById(R.id.tv_detail_real);
        iVphotos = findViewById(R.id.iv_photos);
        tVdesc = findViewById(R.id.tv_desc);

        String name = getIntent().getStringExtra("name");
        String realname = getIntent().getStringExtra("real");
        String photos = getIntent().getStringExtra("photos");
        String desc = getIntent().getStringExtra("desc");


        tVname.setText(name);
        tVrealname.setText(realname);
        tVdesc.setText(desc);
        Glide.with(this).load(photos).into(iVphotos);
    }
}
