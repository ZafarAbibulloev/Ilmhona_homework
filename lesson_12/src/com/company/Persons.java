package com.company;

public class Persons {

    private String name;
    private String lastName;
    private String adress;
    private int ID;
    private double RoumigTime;
    private double LocalTime;


    public Persons(){
        this.adress = "Unknown";
        this.ID = 0000;
        this.name = "Unknown";
        this.lastName = "Unknown";
        this.RoumigTime = 0.00;
        this.LocalTime = 0.00;

    }


    public Persons(String name, String lastName, String adress, int ID, double roumigTime, double localTime) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.ID = ID;
        RoumigTime = roumigTime;
        LocalTime = localTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getRoumigTime() {
        return RoumigTime;
    }

    public void setRoumigTime(double roumigTime) {
        RoumigTime = roumigTime;
    }

    public double getLocalTime() {
        return LocalTime;
    }

    public void setLocalTime(double localTime) {
        LocalTime = localTime;
    }
}
