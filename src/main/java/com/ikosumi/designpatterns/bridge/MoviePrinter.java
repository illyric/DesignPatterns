package com.ikosumi.designpatterns.bridge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getGenre();
    }

    @Override
    protected List<Detail> getDetails() {
        final List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        return details;
    }
}
