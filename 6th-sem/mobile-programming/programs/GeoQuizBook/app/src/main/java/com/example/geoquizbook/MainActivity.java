package com.example.geoquizbook;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
	private String TAG = "lifecycle";
	private int mCurrentIndex = 0;
	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;
	private Button mPrevButton;
	private TextView mQuestionTextView;

	private Question[] mQuestionBank = {
			new Question(R.string.question_africa, true),
			new Question(R.string.question_asia, false),
			new Question(R.string.question_australia, true),
			new Question(R.string.question_oceans, false),
			new Question(R.string.question_mideast, false),
			new Question(R.string.question_americas, false),
	};

	private void updateQuestion() {
		int qId = mQuestionBank[mCurrentIndex].getTextResId();
		mQuestionTextView.setText(qId);
	}

	private void checkAnswer(boolean userPressedAnswer) {
		Toast resultToast = new Toast(MainActivity.this);
		if (userPressedAnswer == mQuestionBank[mCurrentIndex].isAnswerTrue()) {
			resultToast.setText(R.string.correct_toast);
		} else {
			resultToast.setText(R.string.incorrect_toast);
		}
		resultToast.show();

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EdgeToEdge.enable(this);
		setContentView(R.layout.activity_main);

		mQuestionTextView = findViewById(R.id.question_text);
		updateQuestion();

		mTrueButton = findViewById(R.id.true_button);
		mTrueButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				checkAnswer(true);
			}
		});
		mFalseButton = findViewById(R.id.false_button);
		mFalseButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				checkAnswer(false);
			}
		});

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
			return insets;
		});

		mQuestionTextView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				updateQuestion();
			}
		});

		mNextButton = findViewById(R.id.next_button);
		mNextButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				updateQuestion();
			}
		});

		mPrevButton = findViewById(R.id.prev_button);
		mPrevButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mCurrentIndex = mCurrentIndex <= 0 ? mQuestionBank.length - 1 : mCurrentIndex - 1;
				updateQuestion();
			}
		});
	}

	/* 
     * code for lab report 2: (ch.3 of big nerd's ranch guide book)
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart ");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop: ");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy: ");
	}

	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "onSaveInstanceState: saved");
		outState.putInt("currentIndex", mCurrentIndex); // TODO: replace this w/ variable later
	}
	 */
}
