package com.hcoe.mailretry;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		EdgeToEdge.enable(this);
//		setContentView(R.layout.activity_main);
//		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//			Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//			return insets;
//		});
		List<EmailItem> emailList = new ArrayList<EmailItem>();

		emailList.add(new EmailItem("A", "Saroj", "Hello"));
		emailList.add(new EmailItem("B", "Ram", "hi"));
		emailList.add(new EmailItem("C", "Hari", "hi there"));
		emailList.add(new EmailItem("D", "Sita", "hlw"));
		emailList.add(new EmailItem("E", "Anjali", "abc"));
		emailList.add(new EmailItem("F", "Shyam", "xyz"));

		MailArrayAdapter mailArrayAdapter = new MailArrayAdapter(this, R.layout.email_item, emailList);
		GridView gridView = findViewById(R.id.gridView);
		gridView.setAdapter(mailArrayAdapter);
	}
}