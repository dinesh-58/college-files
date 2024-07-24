package com.example.moviesearch;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {
    List<Movie> mMovies;
	public MovieAdapter(Context context, List<Movie> movieList) {
		super(context, 0, movieList);
		this.mMovies = movieList;
	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		if(convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
		}
		Movie currentMovie = mMovies.get(position);
		ImageView poster = convertView.findViewById(R.id.movie_item_poster);
		TextView title = convertView.findViewById(R.id.movie_item_title);
		TextView rating = convertView.findViewById(R.id.movie_item_rating);
		TextView description = convertView.findViewById(R.id.movie_item_description);

		title.setText(currentMovie.getTitle());
		rating.setText(String.format("%s", currentMovie.getRating()));
		description.setText(currentMovie.getDescription());
//		poster.setImageDrawable(Drawable.createFromPath(currentMovie.getPosterUrl()));

		return super.getView(position, convertView, parent);
	}
}
