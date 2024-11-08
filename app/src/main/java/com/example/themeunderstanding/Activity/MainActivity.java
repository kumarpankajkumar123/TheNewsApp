package com.example.themeunderstanding.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.themeunderstanding.Adaptor.RecyclerAdaptor;
import com.example.themeunderstanding.Interfaces.AllInterface;
import com.example.themeunderstanding.Modals.Latest;
import com.example.themeunderstanding.R;
import com.example.themeunderstanding.RetrofitData.RetrofitData;
import com.google.android.material.button.MaterialButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String API_HOST = "newsapi90.p.rapidapi.com";
    private static final String API_KEY = "32f8bcbd6emsh6241cd5139dc1c8p157f48jsn22b4cef94b0e";

    MaterialButton latestNews, world, health, sports, science, entertainment, technology, business;

    RecyclerView recycler;
    RecyclerAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latestNews = findViewById(R.id.latestNews);
        world = findViewById(R.id.world);
        health = findViewById(R.id.health);
        sports = findViewById(R.id.sports);
        science = findViewById(R.id.science);
        entertainment = findViewById(R.id.entertainment);
        technology = findViewById(R.id.technology);
        business = findViewById(R.id.business);
        recycler = findViewById(R.id.recycler);

        latestNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                latestNews.setBackgroundColor(Color.parseColor("#2889d9"));
                world.setBackgroundColor(Color.parseColor("#f6f6f6"));
                health.setBackgroundColor(Color.parseColor("#f6f6f6"));
                sports.setBackgroundColor(Color.parseColor("#f6f6f6"));
                science.setBackgroundColor(Color.parseColor("#f6f6f6"));
                entertainment.setBackgroundColor(Color.parseColor("#f6f6f6"));
                technology.setBackgroundColor(Color.parseColor("#f6f6f6"));
                business.setBackgroundColor(Color.parseColor("#f6f6f6"));
                getResponse("latest");
            }
        });

        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                latestNews.setBackgroundColor(Color.parseColor("#f6f6f6"));
                world.setBackgroundColor(Color.parseColor("#2889d9"));
                health.setBackgroundColor(Color.parseColor("#f6f6f6"));
                sports.setBackgroundColor(Color.parseColor("#f6f6f6"));
                science.setBackgroundColor(Color.parseColor("#f6f6f6"));
                entertainment.setBackgroundColor(Color.parseColor("#f6f6f6"));
                technology.setBackgroundColor(Color.parseColor("#f6f6f6"));
                business.setBackgroundColor(Color.parseColor("#f6f6f6"));
                getResponse("world");
            }
        });

        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

    public void getResponse(String ans) {
        AllInterface allInterface = RetrofitData.getRetrofit().create(AllInterface.class);

        if (ans.equals("latest")) {
            Call<List<Latest>> latestdata = allInterface.getLatestNews("hi-IN", "IN", API_HOST, API_KEY);
            Log.e("the request", ":=" + latestdata.request());
            latestdata.enqueue(new Callback<List<Latest>>() {
                @Override
                public void onResponse(Call<List<Latest>> call, Response<List<Latest>> response) {

                    if (response.isSuccessful() && response.body() != null) {
                        List<Latest> ld = response.body();
                        Log.e("the code", ":" + response.code());
                        Log.e("the body", ":" + response.body());
                        Log.e("the data", ":" + ld.get(0).getTitle());

                        adaptor = new RecyclerAdaptor(ld);
                        recycler.setAdapter(adaptor);
                    } else {
                        Log.e("the body", ":" + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<List<Latest>> call, Throwable throwable) {

                }
            });
        }
        else if (ans.equals("world")) {
            Call<List<Latest>> latestdata = allInterface.getWorldNews("hi-IN", "IN", API_HOST, API_KEY);
        } else if (ans.equals("health")) {
            Call<List<Latest>> latestdata = allInterface.getHealthNews("hi-IN", "IN", API_HOST, API_KEY);
        } else if (ans.equals("sports")) {
            Call<List<Latest>> latestdata = allInterface.getSportsNews("hi-IN", "IN", API_HOST, API_KEY);
        } else if (ans.equals("science")) {
            Call<List<Latest>> latestdata = allInterface.getScienceNews("hi-IN", "IN", API_HOST, API_KEY);
        } else if (ans.equals("entertainment")) {
            Call<List<Latest>> latestdata = allInterface.getEntertaintNews("hi-IN", "IN", API_HOST, API_KEY);
        } else if (ans.equals("technology")) {
            Call<List<Latest>> latestdata = allInterface.getTechnologyNews("hi-IN", "IN", API_HOST, API_KEY);
        } else {
            Call<List<Latest>> latestdata = allInterface.getBusinessNews("hi-IN", "IN", API_HOST, API_KEY);
        }

    }
}