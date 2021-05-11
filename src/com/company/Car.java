package com.company;

public  class Car {
    private String color;
    private int year;
    private double weight;

    public Car(String color, int year, double weight) {
        this.color = color;
        this.year = year;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
