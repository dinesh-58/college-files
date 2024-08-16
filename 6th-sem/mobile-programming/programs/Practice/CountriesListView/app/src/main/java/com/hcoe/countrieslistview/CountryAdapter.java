package com.hcoe.countrieslistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
	private String[] countries;
	public CountryAdapter(String[] countries) {
		this.countries = countries;
	}
	@NonNull
	@Override
	public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

		View listItems = layoutInflater.inflate(R.layout.list_item_country, parent, false);
		return new CountryViewHolder(listItems);
	}

	@Override
	public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
		String country = countries[position];
		holder.mTextView.setText(country);
	}

	@Override
	public int getItemCount() {
		return countries.length;
	}
}

class CountryViewHolder extends RecyclerView.ViewHolder {
	public TextView mTextView;

	public CountryViewHolder(@NonNull View itemView) {
		super(itemView);
		mTextView = itemView.findViewById(R.id.country_name);
	}
}