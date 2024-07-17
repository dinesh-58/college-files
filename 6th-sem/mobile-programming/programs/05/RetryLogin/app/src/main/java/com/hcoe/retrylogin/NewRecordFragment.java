package com.hcoe.retrylogin;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class NewRecordFragment extends Fragment {

	public NewRecordFragment() {
		// Required empty public constructor
	}


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_new_record, container, false);
		EditText nameEditText  = view.findViewById(R.id.new_record_name_EditText);
		EditText emailEditText  = view.findViewById(R.id.new_record_email_EditText);
		Button submitBtn = view.findViewById(R.id.new_record_submit_btn);

		submitBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				SQLiteOpenHelper studentDBHelper = new StudentDBHelper(getContext());
				SQLiteDatabase db = studentDBHelper.getWritableDatabase();

				ContentValues values = new ContentValues();
				values.put("name", nameEditText.getText().toString());
				values.put("email", emailEditText.getText().toString());

				// this is an ORM?
				// sqlite doesn't support null by default so use nullColumnHack if needed?
				long result = db.insert("students", null, values);
				if(result == -1) {
					Snackbar.make(submitBtn, "Couldn't add student", Snackbar.LENGTH_SHORT).show();
				} else {
					Snackbar.make(submitBtn, "Student inserted", Snackbar.LENGTH_SHORT).show();
				}
			}
		});

		return view;
	}
}