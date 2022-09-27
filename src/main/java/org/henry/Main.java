package org.henry;

public class Main {

    public static void main(String[] args) {
        // PROBLEM - 1
        firstProblem();

        // PROBLEM - 2 
        secondProblem();

        // PROBLEM - 3
        thirdProblem();
    }

    private static void firstProblem() {
        System.out.println();
        System.out.println("---START OF PROBLEM 1---");

        // Print out the current exchange rates
        System.out.println("The current exchange rates are USD 1 = ");
        Price price = new Price(1.0);
        price.getRates().forEach((k, v) -> System.out.println(k + " " + v));

        // PROBLEM 1 - can we change one of the rates?
        price.getRates().put("USD", 2d);
        System.out.println("The current exchange rates are USD 1 = ");
        price.getRates().forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println("---END OF PROBLEM 1---");
    }

    private static void secondProblem() {
        System.out.println();
        System.out.println("---START OF PROBLEM 2---");

        // Get all the books printed out
        BookCollection bookCollection1 = new BookCollection();
        bookCollection1.printAllBooks();
        System.out.println();

        // PROBLEM 2 - can we change a book?
        ReadOnlyBook emma = bookCollection1.findBookByName("Emma");
        //emma.setPrice(999d);
        bookCollection1.printAllBooks();

        System.out.println("---END OF PROBLEM 2---");
        System.out.println();
    }

    private static void thirdProblem() {
        System.out.println();
        System.out.println("---START OF PROBLEM 3---");

        // Print out the price of the book Tom Jones
        BookCollection bookCollection2 = new BookCollection();
        ReadOnlyBook book = bookCollection2.findBookByName("Tom Jones");

        System.out.println("Tom Jones costs USD " + book.getPrice());
        System.out.println("Tom Jones costs EUR " + book.getPrice().convert("EUR"));
        System.out.println("Tom Jones costs GBP " + book.getPrice().convert("GBP"));

        System.out.println("---END OF PROBLEM 3---");
        System.out.println();
    }
}
