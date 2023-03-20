package com.duwi.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.duwi.project.adapter.RecentsAdapter;
import com.duwi.project.adapter.TopPlacesAdapter;
import com.duwi.project.model.RecentsData;
import com.duwi.project.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
public class ListActivity extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.lhogo));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.lhogo));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.lhogo));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.lhogo));
        recentsDataList.add(new RecentsData("AM Lake","India","From $200",R.drawable.lhogo));
        recentsDataList.add(new RecentsData("Nilgiri Hills","India","From $300",R.drawable.lhogo));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kasimir Hill","India","$200 - $500",R.drawable.topplaces));

//        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }
    }
