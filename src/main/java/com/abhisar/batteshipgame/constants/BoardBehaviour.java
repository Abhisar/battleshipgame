package com.abhisar.batteshipgame.constants;

public interface BoardBehaviour {
    void  init(int size);
    boolean placeShip(Ship ship, Position pos);
    boolean fireAt(Position pos);
    boolean hasWon();
}
