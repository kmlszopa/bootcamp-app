package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String name = "r8";
        Vehicle audi = new Car(2, name);
        Vehicle rower = new Bike(2,"romet");
        Vehicle taczka = new Bike(2,"taczka");
        rower.drive();

        ArrayList vehicleList = new ArrayList();

        vehicleList.add(audi);
        vehicleList.add(rower);
        vehicleList.add(taczka);

        for (int i = 0; i < vehicleList.size(); i++) {
            Vehicle o = (Vehicle) vehicleList.get(i);
            o.drive();
        }

    }
}
