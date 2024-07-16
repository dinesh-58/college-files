package com.hcoe.retrylogin;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
	private EditText emailInput, passInput;
	private Button loginBtn;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		emailInput = findViewById(R.id.input_email);
		passInput = findViewById(R.id.input_password);
		loginBtn = findViewById(R.id.button_submit);

		loginBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String email = emailInput.getText().toString();
				String password = passInput.getText().toString();
				if (email.equals(getStringByResource(R.string.correct_email)) && password.equals(getStringByResource(R.string.correct_password))) {
					// launch new activity
					Intent i = new Intent(MainActivity.this, UserDashboardActivity.class);
					i.putExtra("email", email);
					MainActivity.this.startActivity(i);
				} else {
//					Toast.makeText(MainActivity.this, "Login details incorrect", Toast.LENGTH_SHORT).show();
					Snackbar.make(loginBtn, "Login details incorrect", Snackbar.LENGTH_SHORT).show();
				}
			}
		});
	}

	private String getStringByResource(int id) {
		return this.getResources().getString(id);
	}
}
