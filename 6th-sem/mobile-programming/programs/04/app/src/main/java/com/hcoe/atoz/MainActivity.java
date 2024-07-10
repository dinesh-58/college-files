package com.hcoe.atoz;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

		ListView alphabetListView = findViewById(R.id.alphabet_list_view);
		String[] alphabets = new String[26];

		char tempChar = 'a';
		for (int i = 0; i < 26; i++) {
			alphabets[i] = String.valueOf(tempChar);
			tempChar++;
		}
		// for ArrayAdapter params, layout specifies which layout to use for each list item
		// next id specifies where to put each item (alphabet in this case)
		ArrayAdapter<String> alphabetAdapter = new ArrayAdapter<String>(
				this, R.layout.alphabet_item, R.id.alphabet_item, alphabets
		);
		// using built-in layout instead of custom
//		ArrayAdapter<String> alphabetAdapter = new ArrayAdapter<String>(
//				this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, alphabets
//		);
		alphabetListView.setAdapter(alphabetAdapter);

	}
}