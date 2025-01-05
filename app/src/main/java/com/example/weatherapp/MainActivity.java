package com.example.weatherapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CityAdapter adapter;
    private List<City> cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cityList = new ArrayList<>();
        cityList.add(new City("Lublin", "lubelskie", 23, 3.5, R.drawable.cloud_icon));
        cityList.add(new City("Świdnik", "lubelskie", 0, -1.0, R.drawable.moon_icon));
        cityList.add(new City("Kraśnik", "lubelskie", 32, 0.0, R.drawable.cloud_icon));
        cityList.add(new City("Warszawa", "mazowieckie", 89, 2.0, R.drawable.cloud_icon));
        cityList.add(new City("Ryki", "lubelskie", 45, 1.0, R.drawable.cloud_icon));
        cityList.add(new City("Mińsk Mazowiecki", "mazowieckie", 12, -2.0, R.drawable.cloud_icon));
        cityList.add(new City("Stalowa Wola", "podkarpackie",0,4.0, R.drawable.moon_icon));
        cityList.add(new City("Rzeszów", "podkarpackie", 21, 2.0, R.drawable.cloud_icon));


        adapter = new CityAdapter(cityList);
        recyclerView.setAdapter(adapter);
    }
}
