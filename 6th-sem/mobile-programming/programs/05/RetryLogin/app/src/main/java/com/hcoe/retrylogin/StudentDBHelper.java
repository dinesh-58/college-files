package com.hcoe.retrylogin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentDBHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "students";
	private static final int DATABASE_VER = 2;

	// ver 1: students(_id integer primary key AUTOINCREMENT, name varchar(50), email varchar(50))
	// ver 2: renamed id to _id

	public StudentDBHelper(@Nullable Context context) {
//		super(context, name, factory, version);
		// version refers to version of database
		// change version when db schema changes. useful for implementing different code based on db version
		super(context, DATABASE_NAME, null, DATABASE_VER);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table if not exists students(_id integer primary key AUTOINCREMENT," +
				" name varchar(50), email varchar(50)" +
				");");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("drop table if exists students");
		onCreate(db);

	}
}
