package com.example.pehchaan;

public class log_model {


    private String name;
    private String numbercl;
    private String date;
    private int imagename;
    private int callcl;
    private String duration;
    private int type;


    public log_model(String name, String numbercl, String date, String duration,int callcl, int type, int imagename) {
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.numbercl = numbercl;
        this.callcl = callcl;
        this.type = type;
        this.imagename = imagename;



    }

    public int getImagename() {
        return imagename;
    }

    public void setImagename(int imagename) {
        this.imagename = imagename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumbercl() {
        return numbercl;
    }

    public void setNumbercl(String numbercl) {
        this.numbercl = numbercl;
    }

    public int getCallcl() {
        return callcl;
    }

    public void setCallcl(int callcl) {
        this.callcl = callcl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
