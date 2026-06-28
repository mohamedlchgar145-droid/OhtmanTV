package com.ohtman.ohtmantv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ohtman.ohtmantv.adapter.CategoryAdapter;
import com.ohtman.ohtmantv.model.Category;
import com.ohtman.ohtmantv.utils.DataManager;

import java.util.List;

public class MainActivity extends AppCompatActivity implements CategoryAdapter.OnCategoryClickListener {

    private RecyclerView recyclerCategories;
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setupRecyclerView();
        setupBottomNavigation();
    }

    private void initViews() {
        recyclerCategories = findViewById(R.id.recyclerCategories);
        bottomNav = findViewById(R.id.bottomNav);
    }

    private void setupRecyclerView() {
        List<Category> categories = DataManager.getCategories();
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerCategories.setLayoutManager(layoutManager);
        CategoryAdapter adapter = new CategoryAdapter(categories, this);
        recyclerCategories.setAdapter(adapter);
    }

    private void setupBottomNavigation() {
        bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_home) {
                return true;
            } else if (itemId == R.id.nav_channels) {
                Toast.makeText(this, "الباقات", Toast.LENGTH_SHORT).show();
                return true;
            } else if (itemId == R.id.nav_movies) {
                startActivity(new Intent(this, MoviesActivity.class));
                return true;
            } else if (itemId == R.id.nav_matches) {
                startActivity(new Intent(this, MatchesActivity.class));
                return true;
            }
            return false;
        });
    }

    @Override
    public void onCategoryClick(Category category) {
        Intent intent = new Intent(this, ChannelsActivity.class);
        intent.putExtra("category_type", category.getType());
        intent.putExtra("category_name", category.getName());
        startActivity(intent);
    }
}
