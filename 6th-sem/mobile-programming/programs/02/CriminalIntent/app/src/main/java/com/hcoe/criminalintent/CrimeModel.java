package com.hcoe.criminalintent;

import java.util.UUID;

public class CrimeModel {
	private UUID mId;
	private String mTitle;

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
