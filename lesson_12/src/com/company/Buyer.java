package com.company;

public class Buyer {

    private String name;
    private String lastName;
    private String adress;
    private String cardID;
    private int ID;

    public Buyer() {
        this.name = "Unknown";
        this.lastName = "Unknown";
        this.adress = "Unknown";
        this.cardID = "Unknown";
        this.ID = 0000;
    }

    public Buyer(String name, String lastName, String adress, String cardID, int ID) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.cardID = cardID;
        this.ID = ID;
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

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}