package org.example;

import org.example.Printable;

import java.util.List;

public class Magazin implements Printable {

    private String MagName;

    public Magazin(String magName) {
        MagName = magName;
    }

    public static void printMagazines(List<Printable> printables){
        for (int i = 0; i < printables.size(); i++) {
            if (printables.get(i) instanceof Magazin){
                printables.get(i).print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Print magazine " + MagName);
    }
}
