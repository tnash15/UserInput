package com.example.tinashe.userinput;

public class Person {

    private String name;
    private String midname;
    private String lstname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getLstname() {
        return lstname;
    }

    public void setLstname(String lastname) {
        this.lstname = lstname;
    }

    public Person(String name, String middlename, String lastname) {
        this.name = name;
        this.midname = midname;
        this.lstname = lstname;
    }
}
