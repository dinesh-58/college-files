package com.hcoe.mailretry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MailArrayAdapter extends ArrayAdapter<EmailItem> {
	private List<EmailItem> emailItems;

	public MailArrayAdapter(@NonNull Context context, int resource, @NonNull List<EmailItem> objects) {
		super(context, resource, objects);
		this.emailItems = objects;
	}
//	public MailArrayAdapter(@NonNull Context context, @NonNull List<EmailItem> objects) {
//		super(context, objects);
//		this.emailItems = objects;
//	}

	@NonNull
	@Override
	public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
		/*
		// if null, inflate recycer view. yet to implement. do so from previous project
		if(convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout)
		}
		*/
		EmailItem currentItem = emailItems.get(position);
		TextView initial = convertView.findViewById(R.id.initial);
		TextView title = convertView.findViewById(R.id.title);
		TextView content = convertView.findViewById(R.id.content);

		initial.setText(currentItem.getTitleInitial());
		title.setText(currentItem.getTitle());
		content.setText(currentItem.getContent());
		return super.getView(position, convertView, parent);
	}
}
