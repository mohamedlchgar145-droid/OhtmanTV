package com.ohtman.ohtmantv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ohtman.ohtmantv.adapter.ChannelAdapter;
import com.ohtman.ohtmantv.model.Channel;
import com.ohtman.ohtmantv.utils.DataManager;

import java.util.List;

public class ChannelsActivity extends AppCompatActivity implements ChannelAdapter.OnChannelClickListener {

    private RecyclerView recyclerChannels;
    private TextView tvTitle;
    private ImageButton btnBack;
    private String categoryType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channels);
        categoryType = getIntent().getStringExtra("category_type");
        String categoryName = getIntent().getStringExtra("category_name");
        initViews();
        tvTitle.setText(categoryName);
        btnBack.setOnClickListener(v -> finish());
        setupRecyclerView();
    }

    private void initViews() {
        recyclerChannels = findViewById(R.id.recyclerChannels);
        tvTitle = findViewById(R.id.tvTitle);
        btnBack = findViewById(R.id.btnBack);
    }

    private void setupRecyclerView() {
        List<Channel> channels = DataManager.getChannelsByCategory(categoryType);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        recyclerChannels.setLayoutManager(layoutManager);
        ChannelAdapter adapter = new ChannelAdapter(channels, this);
        recyclerChannels.setAdapter(adapter);
    }

    @Override
    public void onChannelClick(Channel channel) {
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("stream_url", channel.getStreamUrl());
        intent.putExtra("channel_name", channel.getName());
        startActivity(intent);
    }
}
