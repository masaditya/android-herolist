package com.adityaeka.listhero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements HeroAdapter.OnHeroClickListener {

    RecyclerView recyclerView;
    HeroAdapter heroAdapter;
    ArrayList<Hero> heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_hero);

        heroAdapter = new HeroAdapter(this,HeroData.getHeroes(), this);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(heroAdapter);


    }

    @Override
    public void onClick(Hero hero) {
        Intent intent = new Intent(MainActivity.this, DetailHeroActivity.class);
        intent.putExtra("name", hero.getName());
        intent.putExtra("real", hero.getRealname());
        intent.putExtra("photos", hero.getPhotos());
        intent.putExtra("desc", hero.getDesc());

        startActivity(intent);
    }
}
