package com.example.quizapp;

public class trueorfalse
{
    private int mquestionid;
    private boolean manswer;

    public trueorfalse(int qresourceid,boolean trueorfals)
    {
        mquestionid=qresourceid;
        manswer=trueorfals;
    }

    public int getMquestionid() {
        return mquestionid;
    }

    public void setMquestionid(int mquestionid) {
        this.mquestionid = mquestionid;
    }

    public boolean isManswer() {
        return manswer;
    }

    public void setManswer(boolean manswer) {
        this.manswer = manswer;
    }
}
