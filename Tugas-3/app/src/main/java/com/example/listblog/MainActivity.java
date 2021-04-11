package com.example.listblog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvMovies;
    private ArrayList<MovieModel> list = new ArrayList<>();

    private String title = "Movie List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvMovies =findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);
        list.addAll(MoviesData.getListData());

        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        CardViewMoviesAdapter cardViewMoviesAdapter = new CardViewMoviesAdapter(list, this);
        rvMovies.setAdapter(cardViewMoviesAdapter);
    }


    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


}