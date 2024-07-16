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

		// to show menu inside toolbar; use if actionBar is not enabled
		/*
		 TODO: fix  error caused by this
		Toolbar dashboardToolbar = findViewById(R.id.dashboard_toolbar);
		this.setSupportActionBar(dashboardToolbar);
		 */

		fm = getSupportFragmentManager();
		currentFragment = fm.findFragmentById(R.id.dashboard_fragment_container);
		if (currentFragment == null) {
			Intent i = getIntent();
			Bundle defaultfragmentBundle = new Bundle();
			defaultfragmentBundle.putString("email", i.getStringExtra("email"));
			currentFragment = new DefaultDashboardFragment();
			currentFragment.setArguments(defaultfragmentBundle);
			fm.beginTransaction().add(R.id.dashboard_fragment_container, currentFragment).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		return super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		if (item.getItemId() == R.id.new_record_menuItem) {
			currentFragment = new NewRecordFragment();
		} else if (item.getItemId() == R.id.list_records_menuItem) {
			currentFragment = new ListRecordsFragment();
		}
		// *: using .replace() instead of .add() to get rid of prev. fragment as well
		fm.beginTransaction().replace(R.id.dashboard_fragment_container, currentFragment).commit();
		return false;
	}
}