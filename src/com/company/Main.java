package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Printable audi = createObject("Audi");
        audi.print();
        Printable lexus = createObject("Lexus");
        lexus.print();
        Printable tesla =createObject("Tesla");
        tesla.print();

    }

    public static Printable createObject(String className) {
        Printable model = new Audi(" ", 0, 0, " ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter color ");
        String color = scanner.next();
        System.out.println(" Enter year ");
        int year = scanner.nextInt();
        System.out.println(" Enter weight ");
        double weight = scanner.nextDouble();
        if (className.equals("Tesla")) {
            System.out.println(" Enter power ");
            double power = scanner.nextDouble();
            model = new Tesla(color, year, weight, power);
        } else if (className.equals("Audi")) {
            System.out.println("Enter model ");
            String audiModel = scanner.next();
            model = new Audi(color, year, weight, audiModel);
        } else if (className.equals("Lexus")) {
            System.out.println(" Enter label ");
            String lexusLabel = scanner.next();
            model = new Lexus(color, year, weight, lexusLabel);
        }

        return model;

    }
}
