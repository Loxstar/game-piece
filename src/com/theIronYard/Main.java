package com.theIronYard;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        GamePiece horse = new GamePiece();
        horse.setName("Mr. Ed");
        horse.move();
        horse.freeze();
        horse.move();
        horse.unfreeze();
        horse.move();

    }
}
