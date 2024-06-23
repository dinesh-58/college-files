package com.example.geoquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

	Question[] questions = new Question[] {
		new Question(1, "Is KTM the capital of nepal?", false),
		new Question(1, "Is KTM the capital of nepal?", false),
		new Question(1, "Is KTM the capital of nepal?", false),
	};
	int currentIndex = 0;

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

		Button btnTrue = findViewById(R.id.btnTrue);
		Button btnFalse = findViewById(R.id.btnFalse);

		TextView txtButton = findViewById(R.id.txtQuestion);
		txtButton.setText((CharSequence) questions[currentIndex]);
		Button btnNext = findViewById(R.id.btnNext);
		Button btnPrev = findViewById(R.id.btnPrev);

		btnTrue.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (questions[currentIndex].getIsAnswerTrue() == true)	{
					Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT);
				} else Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT);
			}
		});
		btnFalse.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (questions[currentIndex].getIsAnswerTrue() == false)	{
					Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT);
				} else Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT);
			}
		});
	}
}