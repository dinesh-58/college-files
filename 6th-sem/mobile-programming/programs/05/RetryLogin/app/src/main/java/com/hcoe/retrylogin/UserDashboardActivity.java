package com.hcoe.retrylogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class UserDashboardActivity extends AppCompatActivity {
	private FragmentManager fm;
	private Fragment currentFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_dashboard);
		TextView userDashboardWelcome = findViewById(R.id.user_dashboard_welcome);
		Intent i = getIntent();
		userDashboardWelcome.setText("Welcome, " + i.getStringExtra("email"));

		// to show menu inside toolbar; use if actionBar is not enabled
		Toolbar dashboardToolbar = findViewById(R.id.dashboard_toolbar);
		this.setSupportActionBar(dashboardToolbar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		return super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_main, menu);

		fm = getSupportFragmentManager();
		currentFragment = fm.findFragmentById(R.id.dashboard_fragment_container);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		if (item.getItemId() == R.id.new_record_menuItem) {
			currentFragment = new NewRecordFragment();
		}
		fm.beginTransaction().add(R.id.dashboard_fragment_container, currentFragment).commit();
		return false;
	}
}