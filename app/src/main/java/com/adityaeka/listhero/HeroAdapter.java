package com.adityaeka.listhero;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {


    Context context;
    ArrayList<Hero> heroArrayList;
    private OnHeroClickListener listener;



    public HeroAdapter(Context context, ArrayList<Hero> heroArrayList, OnHeroClickListener listener) {
        this.context = context;
        this.heroArrayList = heroArrayList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_hero, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Hero hero = heroArrayList.get(i);
        viewHolder.bind(hero, listener);
    }

    @Override
    public int getItemCount() {
        return (heroArrayList != null) ? heroArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvRealName;
        ImageView ivHero;
        Button btnFav, btnShare;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvRealName = itemView.findViewById(R.id.tv_real_name);
            ivHero = itemView.findViewById(R.id.iv_hero);
            btnFav = itemView.findViewById(R.id.btn_fav);
            btnShare = itemView.findViewById(R.id.btn_share);


        }

        public void bind(final Hero hero, final OnHeroClickListener onHeroClickListener){
            tvName.setText(hero.getName());
            tvRealName.setText(hero.getRealname());
            Glide.with(itemView.getContext()).load(hero.getPhotos()).into(ivHero);
            btnFav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Favorite"+hero.getName(), Toast.LENGTH_SHORT).show();
                }
            });

            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), "Share"+hero.getName(), Toast.LENGTH_SHORT).show();
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onHeroClickListener.onClick(hero);
                }
            });
        }


    }

    public interface OnHeroClickListener{
        void onClick(Hero hero);
    }


}
