package com.hcoe.criminalintent;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);
		setContentView(R.layout.activity_main);
		FragmentManager fm = getSupportFragmentManager();
		Fragment crimeFragment =  fm.findFragmentById(R.id.crime_fragment_container);
		// not null if fragment has already been placed inside this activity?
		if(crimeFragment == null) {
			// possible because Activities & fragments are  fundamentally just classes
			crimeFragment = new CrimeFragment();
			// add crimeFragment to container
			fm.beginTransaction().add(R.id.crime_fragment_container, crimeFragment).commit();

		}
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.crime_fragment_container), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});
	}
}