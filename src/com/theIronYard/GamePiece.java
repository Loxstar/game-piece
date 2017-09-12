package com.theIronYard;

import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String color;
    String name;

    //empty constructor
    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }

    //get methods
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    boolean getFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        Random rando = new Random();
        if(this.frozen == false){
//            this.positionX = positionX;
//            this.positionY = positionY;

//            Random.nextInt
            this.positionX = rando.nextInt();
            this.positionY = rando.nextInt();

        }else{
            System.out.println("Frozen Sucka!");
        }
    }

    public void freeze(){
        frozen = true;
    }

    public void unfreeze(){
        frozen = false;
    }

}
