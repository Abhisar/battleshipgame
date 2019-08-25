package com.abhisar.batteshipgame.constants;

public enum ShipType {
    DESTROYER("Destroyer",2),
    SUBMARINE("Submarine",3),
    CRUISER("Cruiser",3),
    BATTLESHIP("Battleship",4),
    CARRIER("Carrier",5);

    String desc;
    int length;

    private ShipType(String desc, int size)
    {
        this.desc = desc;
        this.length =  size;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getLength() {
        return this.length;
    }
}
