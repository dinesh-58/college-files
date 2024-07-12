package com.hcoe.practicelogin;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
	private EditText emailInput, passInput;
	private Button loginBtn;

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
		super.onCreate(savedInstanceState, persistentState);
		setContentView(R.layout.activity_main);

		emailInput = findViewById(R.id.input_email);
		String email = emailInput.getText().toString();
		passInput = findViewById(R.id.input_password);
		String password = passInput.getText().toString();
		loginBtn = findViewById(R.id.button_submit);

		loginBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (email.equals(getStringByResource(R.string.correct_email))
						&&
						password.equals(getStringByResource(R.string.correct_password))) {
					// launch new activity

				} else {
					Toast.makeText(MainActivity.this, "Login details incorrect", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	private String getStringByResource(int id) {
		return this.getResources().getString(id);
	}

}
