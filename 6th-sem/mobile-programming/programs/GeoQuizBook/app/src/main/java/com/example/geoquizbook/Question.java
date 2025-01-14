package com.example.geoquizbook;

public class Question {
	private int mTextResId;
	private boolean mAnswerTrue;

	public boolean isCheated() {
		return mCheated;
	}

	public void setCheated(boolean cheated) {
		mCheated = cheated;
	}

	private boolean mCheated;

	public int getTextResId() {
		return mTextResId;
	}

public void setTextResId(int textResId) {
		mTextResId = textResId;
	}

	public boolean isAnswerTrue() {
		return mAnswerTrue;
	}

	public void setAnswerTrue(boolean answerTrue) {
		mAnswerTrue = answerTrue;
	}

	public Question(int mTextResId, boolean mAnswerTrue) {
		this.mTextResId = mTextResId;
		this.mAnswerTrue = mAnswerTrue;
		this.mCheated = false;
	}
	public Question(int mTextResId, boolean mAnswerTrue, boolean mCheated) {
		this.mTextResId = mTextResId;
		this.mAnswerTrue = mAnswerTrue;
		this.mCheated = mCheated;
	}
}
