package com.ikosumi.designpatterns.bridge;

public class MovieTest {

    public static void main(String[] args) {
        Movie movie = new Movie("Fight Club", "1995", "Action", "2.31 h");

        Formatter printFormatter = new PrintFormatter();
        Printer movePrinter = new MoviePrinter(movie);
        String printedMaterial = movePrinter.print(printFormatter);
        System.out.println(printedMaterial);
    }
}
