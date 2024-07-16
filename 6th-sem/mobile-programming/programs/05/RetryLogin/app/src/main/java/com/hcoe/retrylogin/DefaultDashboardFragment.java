package com.hcoe.retrylogin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DefaultDashboardFragment extends Fragment {

	public DefaultDashboardFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_default_dashboard, container, false);
		Bundle bundle = getArguments();
		String email = bundle != null ? bundle.getString("email") : "foo@bar.com";
		TextView tView =  view.findViewById(R.id.default_dashboard_textview);
		tView.setText(this.getString(R.string.default_dashboard_text_format, email));
		return view;
	}
}