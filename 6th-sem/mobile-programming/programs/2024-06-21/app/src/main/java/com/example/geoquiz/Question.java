package com.example.geoquiz;

public class Question {
    private int quesResourceID;
    private String quesText;
    private boolean isAnswerTrue;

    // TODO: get quesText using resourceID later
    public Question(int quesResourceID, String quesText, boolean isAnswerTrue) {
        this.quesResourceID = quesResourceID;
        this.quesText = quesText;
        this.isAnswerTrue = isAnswerTrue;
    }

    public int getquesResourceID() {
        return quesResourceID;
    }
    public boolean getIsAnswerTrue() {
        return isAnswerTrue;
    }
}
