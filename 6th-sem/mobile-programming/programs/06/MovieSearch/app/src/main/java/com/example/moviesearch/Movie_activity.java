package com.example.moviesearch;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;


import cz.msebera.android.httpclient.Header;


public class Movie_activity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie);


        ListView listView = findViewById(R.id.listMovieView);


        ArrayList<Movie> movieList = new ArrayList<Movie>();
        /*
        movieList.add(new Movie("Snowpiercer", "Lorem ipsum", "google.com", 9.5));
        movieList.add(new Movie("Dark", "Lorem ipsum", "google.com", 9.5));
        movieList.add(new Movie("The Grand Budapest Hotel", "Lorem ipsum", "google.com", 9.5));
         */

        /*
        String[] movieName = {"Dark", "Money Heist", "The Silent Patient"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.movie_item, R.id.movieName, movieName);
        ArrayAdapter<Movie> arrayAdapter = new ArrayAdapter<Movie>(this, R.layout.movie_item, R.id.movieName, movieName);
         */
        MovieAdapter movieAdapter = new MovieAdapter(this, movieList);
        listView.setAdapter(movieAdapter);

        findViewById(R.id.movie_search_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

				String API_KEY = "c5db3bd0";
				String API_URL = "http://www.omdbapi.com/";

				RequestParams params = new RequestParams("apikey", API_KEY);
				params.add("s", "great");

				AsyncHttpClient client = new AsyncHttpClient();
//                client.get("http://www.omdbapi.com/?apikey=c5db3bd0&s=great", new JsonHttpResponseHandler() {
				client.get(API_URL, params, new JsonHttpResponseHandler() {

					@Override
					public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
						// called when http request is succesful
						super.onSuccess(statusCode, headers, response);
						Log.d("OMDB_API", "status code: " + statusCode + "\n response: " + response.toString());

						try {
							JSONArray items = response.getJSONArray("Movies");
//							for(var m: items) {
////                                JSONObject currentMovie = items.getJSONObject(i);
//								movieList.add(new Movie());
//
//							}
							movieAdapter.clear();
							movieAdapter.addAll(movieList);
							movieAdapter.notifyDataSetChanged();
						} catch (JSONException e) {
							e.printStackTrace();
						}
					}

					@Override
					public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
						super.onFailure(statusCode, headers, throwable, errorResponse);
						Log.d("OMDB_API", "onFailure: response: ");
						throwable.printStackTrace();
					}
				});
			}
        });

//                apikey=c5db3bd0
//                http://www.omdbapi.com/?i=tt3896198&apikey=c5db3bd0
    }


}
