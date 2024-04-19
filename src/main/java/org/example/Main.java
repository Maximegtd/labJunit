package org.example;

import org.lab.Calculatrice;

public class Main {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();

        double s = c.somme(10, 20);
        System.out.println("Somme: " + s);

        double p = c.product(10, 20);
        System.out.println("Product: " + p);
    }
}