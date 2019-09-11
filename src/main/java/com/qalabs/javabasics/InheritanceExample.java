package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }
    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }
    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}

class RoadBike extends  Bike {


    RoadBike(String brand) {
        super(brand);

    }

    @Override
    void speedUp() {
        int speed = this.getSpeed() + 3;
        this.setSpeed(speed);
        System.out.println(String.format("RoadBike %s speed %d", this.getBrand(), this.getSpeed()));
    }
}

public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike outside solve");
        System.out.println(bike.getBrand());
        solve(bike);
        System.out.println(bike.getBrand());
        RoadBike roadbike = new RoadBike("Venoto");
        roadbike.speedUp();
        assert roadbike.getSpeed() == 3 : "Velocidad mal calculada, debe ser 3";
        assert roadbike.getSpeed() == 4 : "Velocidad mal calculada, debe ser 4";
    }

    public static void solve(Bike bike) {
        bike.setBrand("Bike inside solve");
    }
}
