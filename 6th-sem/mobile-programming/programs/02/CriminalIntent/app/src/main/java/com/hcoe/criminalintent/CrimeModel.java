package com.hcoe.criminalintent;

import java.util.UUID;
import java.util.Date;

public class CrimeModel {
	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mIsSolved;

	public boolean isSolved() {
		return mIsSolved;
	}

	public void setSolved(boolean solved) {
		mIsSolved = solved;
	}

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date date) {
		mDate = date;
	}

	public CrimeModel() {
		this.mId = UUID.randomUUID();
	}
	public UUID getId() {
		return mId;
	}
	public CrimeModel setTitle(String title) {
		this.mTitle = title;
		return  this;
	}
	public String getTitle() {
		return mTitle;
	}

}
