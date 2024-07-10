package com.hcoe.criminalintent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class CrimeFragment extends Fragment {
	private CrimeModel mCrimeModel;
	private EditText crimeTitleTextbox;
	private Button datePickerButton;
	private CheckBox solvedCheckbox;

	public CrimeFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mCrimeModel = new CrimeModel();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_crime, container, false);
		crimeTitleTextbox = view.findViewById(R.id.crime_title_textbox);

		// TODO: make separate notes about addTextChangedListener
		crimeTitleTextbox.addTextChangedListener(new TextWatcher() {
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {

			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				mCrimeModel.setTitle(s.toString());
			}

			@Override
			public void afterTextChanged(Editable s) {

			}
		});

		datePickerButton = view.findViewById(R.id.crime_date_picker_button);
		datePickerButton.setText(mCrimeModel.getDate().toString());
		datePickerButton.setEnabled(false);
		datePickerButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				DatePickerFragment dateFragment = new DatePickerFragment();
				dateFragment.show(requireActivity().getSupportFragmentManager(), "datePicker");
			}
		});

		solvedCheckbox = view.findViewById(R.id.crime_solved_checkbox);
		solvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				mCrimeModel.setSolved(isChecked);
			}
		});
		return view;
	}
}