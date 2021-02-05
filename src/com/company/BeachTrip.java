package com.company;

public class BeachTrip extends Trip{
            String type = "Beach Trip";
    private String equipment;
    private boolean rememberSunscreen = false;

    public BeachTrip(String country, int duration, double cost, String transportation, String equipment, boolean rememberSunscreen) {
        super(country, duration, cost, transportation);
        this.equipment = equipment;
        this.rememberSunscreen = rememberSunscreen;
    }

    public String getEquipment() {
        return equipment;
    }

    public boolean isRememberSunscreen() {
        return rememberSunscreen;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setRememberSunscreen(boolean rememberSunscreen) {

        this.rememberSunscreen = rememberSunscreen;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type+":\n" + super.toString() + "\nEquipment: " + equipment + "\nDid you remember sun screen?: " + rememberSunscreen + "\n----------------------\n";
    }
}
