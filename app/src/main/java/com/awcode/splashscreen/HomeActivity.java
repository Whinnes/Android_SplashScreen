package com.awcode.splashscreen;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Slide> lstSlide;
    private ViewPager slidePager;

    RecyclerView CategoriesRecyclerView;
    CategoriesAdapter categoriesAdapter;
    List<CategoriesItem> lstItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        slidePager = findViewById(R.id.slider_page);

        lstSlide = new ArrayList<>();
        lstSlide.add(new Slide(R.drawable.slide01, null));
        lstSlide.add(new Slide(R.drawable.slide02, null));
        //lstSlide.add(new Slide(R.drawable.slide03, null));
        lstSlide.add(new Slide(R.drawable.slide04, null));

        SlidePageAdapter adapter = new SlidePageAdapter(this, lstSlide);
        slidePager.setAdapter(adapter);

        CategoriesRecyclerView = findViewById(R.id.rv_categories);
        lstItem = new ArrayList<>();

        lstItem.add(new CategoriesItem("Onion Fresh","New Offer",R.drawable.onion, R.drawable.shape_btn1));
        lstItem.add(new CategoriesItem("Green Peppers","New Offer",R.drawable.green_pepper, R.drawable.shape_btn1));
        lstItem.add(new CategoriesItem("Tomatoes","New Offer",R.drawable.tomatoes, R.drawable.shape_btn1));

        categoriesAdapter = new CategoriesAdapter(this, lstItem);
        CategoriesRecyclerView.setAdapter(categoriesAdapter);
        CategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
