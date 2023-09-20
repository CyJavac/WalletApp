package com.carlosabaunza.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> dataSet;

    public CategoryAdapter(ArrayList<Category> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_category_list, parent,false);
        return new CategoryAdapter.ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Category myCategory = dataSet.get(position);
        holder.loadInfo(myCategory);
    }

    @Override
    public int getItemCount() {

        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameCategory, tvDescCategory;

        private ImageView ivCategory;
        private Button btnColor;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameCategory = itemView.findViewById(R.id.tv_item_name_category);
            //tvDescCategory = itemView.findViewById(R.id.tv_item_de);
            ivCategory = itemView.findViewById(R.id.iv_item_category);
            btnColor = itemView.findViewById(R.id.btn_color);


        }

        public void loadInfo(Category myCategory){
            tvNameCategory.setText(myCategory.getName_cat());
            //tvDescCategory.setText(myAccount.getType());
            //tvDescCategory.setText(String.valueOf(myAccount.getCurrentValue()));
            Picasso
                    .get()
                    .load(myCategory.getIcon())
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                    .into(ivCategory);
        }
    }

}
