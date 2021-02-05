package com.company;

public class SkiTrip extends Trip {
            String type = "Ski Trip";
    private String equipment;
    private int liftCard;

    public SkiTrip(String country, int duration, double cost, String transportation, String equipment, int liftCard) {
        super(country, duration, cost, transportation);
        this.equipment = equipment;
        this.liftCard = liftCard;
    }

    public String getEquipment() {
        return equipment;
    }

    public int getLiftCard() {
        return liftCard;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setLiftCard(int liftCard) {
        this.liftCard = liftCard;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type+":\n" + super.toString() + "\nEquipment: " + equipment + "\nLiftcard num: " + liftCard + "\n----------------------\n";
    }
}
