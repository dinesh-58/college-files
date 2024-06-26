package com.example.geoquizbook;

public class Question {
	private int mTextResId;
	private boolean mAnswerTrue;

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
	}
}
