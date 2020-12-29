package com.company;

public class Vehicle {

    private int wheelNumber;
    private String name;

    public Vehicle(int wheelNumber,String name) {
        this.wheelNumber = wheelNumber;
        this.name = name;
    }

    public void drive(){
        System.out.println("Pojazd o nazwie " + this.name + " zapierdala");
    }
}
