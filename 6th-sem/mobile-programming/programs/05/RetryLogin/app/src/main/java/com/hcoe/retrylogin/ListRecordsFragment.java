package com.hcoe.retrylogin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListRecordsFragment extends Fragment {
	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_list_records, container, false);

		ListView list = view.findViewById(R.id.list_records_ListView);
		SQLiteOpenHelper studentDBHelper = new StudentDBHelper(getContext());
		SQLiteDatabase db = studentDBHelper.getWritableDatabase();
		String[] columns = {"_id", "name", "email"};
		Cursor cursor = db.query("students", columns, null, null, null, null, null);

		if ((cursor != null) && (cursor.getCount() > 0)) {
			String[] from = {"name"};
			int[] to = {R.id.list_single_name_TextView};

			// from & to are use for mapping. i.e. put "name" from cursor in the appropriate View (using its resource id)
			CursorAdapter cursorAdapter = new SimpleCursorAdapter(getContext(), R.layout.list_single_record, cursor, from, to );
			list.setAdapter(cursorAdapter);
		} else {
			view.findViewById(R.id.no_records_msg_TextView).setVisibility(View.VISIBLE);
		}

		return view;
	}
}
