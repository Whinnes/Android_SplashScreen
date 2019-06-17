package com.awcode.splashscreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {


    Context mcontext;
    List<CategoriesItem> lstCategories;

    public CategoriesAdapter(Context mcontext, List<CategoriesItem> lstCategories) {
        this.mcontext = mcontext;
        this.lstCategories = lstCategories;
    }

    @NonNull
    @Override
    public CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View layout;
        layout = LayoutInflater.from(mcontext).inflate(R.layout.item_categories, viewGroup,false);

        return new CategoriesViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesViewHolder categoriesViewHolder, int i) {

        categoriesViewHolder.tv_title.setText(lstCategories.get(i).getTitle());
        categoriesViewHolder.tv_offer.setText(lstCategories.get(i).getOffer());
        categoriesViewHolder.img_product.setImageResource(lstCategories.get(i).getProductItem());
        categoriesViewHolder.img_offer.setImageResource(lstCategories.get(i).getProductOffer());

    }

    @Override
    public int getItemCount() {
        return lstCategories.size();
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title, tv_offer;
        ImageView img_product, img_offer;




        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_offer = itemView.findViewById(R.id.tv_offer);
            img_product = itemView.findViewById(R.id.img_product);
            img_offer = itemView.findViewById(R.id.img_offer);

        }
    }
}
