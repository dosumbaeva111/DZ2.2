package com.company;

public class Audi extends Car implements Printable {
    private String model;

    public Audi(String color, int year, double weight, String model) {
        super(color, year, weight);
        this.model = model;
    }


    @Override
    public void print() {
        System.out.println( "color " + super.getColor() + " weight " + super.getWeight() + " year " + super.getYear() + " model " + model);

    }

}

