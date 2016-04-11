package com.ikosumi.designpatterns.bridge;

import org.junit.Test;

public class MovieTest {
    private Movie movie = new Movie("Fight Club", "1995", "Action", "2.31 h");

    @Test
    public void testPrintFormatter() {
        Formatter printFormatter = new PrintFormatter();
        Printer movePrinter = new MoviePrinter(movie);
        String printedMaterial = movePrinter.print(printFormatter);
        System.out.println(printedMaterial);
    }

    @Test
    public void testHtmlFormatter() {
        Formatter htmlFormatter = new HtmlFormatter();
        Printer printer = new MoviePrinter(movie);
        String htmlOutput = printer.print(htmlFormatter);
        System.out.println(htmlOutput);
    }
}
