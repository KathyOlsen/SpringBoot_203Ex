package com.example.demo;

public class Employee {
    private long id;
    private String firstname;
    private String lastname;
    private int ssn;
    private int dobmo;
    private int dobday;
    private int dobyear;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getDobmo() {
        return dobmo;
    }

    public void setDobmo(int dobmo) {
        this.dobmo = dobmo;
    }

    public int getDobday() {
        return dobday;
    }

    public void setDobday(int dobday) {
        this.dobday = dobday;
    }

    public int getDobyear() {
        return dobyear;
    }

    public void setDobyear(int dobyear) {
        this.dobyear = dobyear;
    }
}
