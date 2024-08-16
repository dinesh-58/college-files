package com.hcoe.countrieslistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);
		setContentView(R.layout.activity_main);
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});

		String[] countries = { "Nepal", "India", "Georgia", "Iraq", "Israel" };
		/*
		ListView list = findViewById(R.id.list);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item_coutnry, countries);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
		list.setAdapter(arrayAdapter);
		 */

		RecyclerView recyclerView = findViewById(R.id.recycler_view);
		CountryAdapter countryAdapter = new CountryAdapter(countries);
		// necessary to set layout manager for recycler views
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(countryAdapter);
	}
}