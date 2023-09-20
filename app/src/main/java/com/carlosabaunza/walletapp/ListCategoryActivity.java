package com.carlosabaunza.walletapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ListCategoryActivity extends AppCompatActivity {
    private FloatingActionButton fbNewCat;


    private ArrayList<Category> listCategoryRV = new ArrayList<>();

    private RecyclerView myRecycleCategory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        loadFakeDataCategorias();

        myRecycleCategory = findViewById(R.id.rv_list_categories);
        CategoryAdapter myCatAdapter = new CategoryAdapter(listCategoryRV);
        myRecycleCategory.setAdapter(myCatAdapter);
        myRecycleCategory.setLayoutManager(new LinearLayoutManager(ListCategoryActivity.this));

        fbNewCat = findViewById(R.id.fb_new_cat);

        fbNewCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(ListCategoryActivity.this, NewCategoryActivity.class);
                startActivity(myIntent);

            }
        });


    }

    private void loadFakeDataCategorias(){
        Category myCategory1 = new Category("restaurante","Descr","#F79800","https://png.pngtree.com/png-clipart/20210311/original/pngtree-restaurant-icon-design-template-illustration-png-image_5992934.jpg");
        Category myCategory2 = new Category("Gasolina","Descr","#F79800","https://cdn-icons-png.flaticon.com/512/483/483497.png");
        Category myCategory3 = new Category("Arriendo","Descr","#F79800","https://cdn-icons-png.flaticon.com/512/2558/2558032.png");
        listCategoryRV.add(myCategory1);
        listCategoryRV.add(myCategory2);
        listCategoryRV.add(myCategory3);
    }


}

