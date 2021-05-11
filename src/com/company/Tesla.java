package com.company;

public class Tesla extends Car implements Printable {
    private double power;

    public Tesla(String color, int year, double weight, double power) {
        super(color, year, weight);
        this.power = power;
    }

    @Override
    public void print() {
        System.out.println( "color " + super.getColor() + " weight " + super.getWeight() + " year " + super.getYear() + " model " + power);
    }

}
