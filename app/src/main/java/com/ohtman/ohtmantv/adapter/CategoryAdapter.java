package com.ohtman.ohtmantv.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ohtman.ohtmantv.R;
import com.ohtman.ohtmantv.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<Category> categories;
    private OnCategoryClickListener listener;

    public interface OnCategoryClickListener {
        void onCategoryClick(Category category);
    }

    public CategoryAdapter(List<Category> categories, OnCategoryClickListener listener) {
        this.categories = categories;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Category category = categories.get(position);
        holder.tvName.setText(category.getName());
        int logoRes = getLogoResource(category.getType());
        if (logoRes != 0) {
            holder.imgLogo.setImageResource(logoRes);
        }
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onCategoryClick(category);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    private int getLogoResource(String type) {
        switch (type) {
            case "bein_max": case "bein_4k": case "bein_hd": case "bein_sd":
                return R.drawable.logo_bein;
            case "arab_sport": return R.drawable.logo_arab_sport;
            case "world_sport": return R.drawable.logo_world_sport;
            case "matches": return R.drawable.logo_matches;
            case "mbc": return R.drawable.logo_mbc;
            case "osn": return R.drawable.logo_osn;
            case "netflix": return R.drawable.logo_netflix;
            case "news": return R.drawable.logo_news;
            case "kids": return R.drawable.logo_kids;
            default: return R.drawable.ic_channel;
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView tvName;

        ViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgCategory);
            tvName = itemView.findViewById(R.id.tvCategoryName);
        }
    }
}
