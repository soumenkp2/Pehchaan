package com.example.pehchaan;


public class model {

    private String txt;
    private String number;
    private int imagename;
    private int call;
    private int message;


    public model(String string, String string1, int imagename, int call, int message) {

        this.txt = string;
        this.number = string1;
        this.imagename = imagename;
        this.call = call;
        this.message = message;


    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImagename() {
        return imagename;
    }

    public void setImagename(int imagename) {
        this.imagename = imagename;
    }
}
