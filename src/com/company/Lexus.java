package com.company;

public class Lexus extends Car implements Printable {
    private String label;

    public Lexus(String color, int year, double weight, String label) {
        super(color, year, weight);
        this.label = label;
    }

    @Override
    public void print() {
        System.out.println( "color " + super.getColor() + " weight " + super.getWeight() + " year " + super.getYear() + " model " + label);
    }
}