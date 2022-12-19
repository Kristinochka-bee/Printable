package org.example;




import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//Создать статический метод printMagazines(Printable[] printable) в классе
// Magazine, который выводит на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book,
// который выводит на консоль названия только книг. Используем оператор instanceof.

        List<Printable> BooksAndMagazines= new ArrayList<>();

        BookDok bookDok1 = new BookDok("Jack London");
        BookDok bookDok2 = new BookDok("Veronika");
        BookDok bookDok3 = new BookDok("Duma");

        Magazin magazin1 = new Magazin("Forbes");
        Magazin magazin2 = new Magazin("Vogue");
        Magazin magazin3 = new Magazin("Times");

        BooksAndMagazines.add(bookDok1);
        BooksAndMagazines.add(bookDok2);
        BooksAndMagazines.add(bookDok3);
        BooksAndMagazines.add(magazin1);
        BooksAndMagazines.add(magazin2);
        BooksAndMagazines.add(magazin3);

       // BooksAndMagazines.forEach(Printable::print);

        //Magazin.printMagazines(BooksAndMagazines);

        BookDok.printBooks(BooksAndMagazines);
    }

}