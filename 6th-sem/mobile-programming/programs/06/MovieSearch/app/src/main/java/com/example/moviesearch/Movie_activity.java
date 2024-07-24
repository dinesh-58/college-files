package com.example.moviesearch;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Movie_activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie);


        ListView listView = findViewById(R.id.listMovieView);


        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Snowpiercer", "Lorem ipsum", "google.com", 9.5));
        movieList.add(new Movie("Dark", "Lorem ipsum", "google.com", 9.5));
        movieList.add(new Movie("The Grand Budapest Hotel", "Lorem ipsum", "google.com", 9.5));

        /*
        String[] movieName = {"Dark", "Money Heist", "The Silent Patient"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.movie_item, R.id.movieName, movieName);
        ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<Movie>(this, R.layout.movie_item, R.id.movieName, movieName);
         */
        MovieAdapter movieAdapter = new MovieAdapter(this, movieList);
        listView.setAdapter(movieAdapter);

    }


}
