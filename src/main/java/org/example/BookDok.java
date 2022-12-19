package org.example;

import org.example.Printable;

import java.util.List;

public class BookDok implements Printable {

    private String DocName;

    public BookDok(String docName) {
        DocName = docName;
    }

    @Override
    public void print() {
        System.out.println("Print book " + DocName);

    }
    public static void printBooks(List<Printable> printables){
        for (int i = 0; i < printables.size(); i++) {
            if (printables.get(i) instanceof BookDok){
                printables.get(i).print();
            }
        }
    }
}
