package com.company;

public class Trip {
    String country;
    int duration;
    double cost;
    String transportation;
    String git;

    public Trip(String country, int duration, double cost, String transportation) {
        this.country = country;
        this.duration = duration;
        this.cost = cost;
        this.transportation = transportation;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String toString(){
        return "Country: " + country + "\nDuration: " + duration + " days\nCost : " + cost + "\nTransportation: " +
                 transportation;

    }
}
