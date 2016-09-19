package com.ikosumi.designpatterns.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {
    @Test
    public void canCreateGameUsingBuilder() {
        Game.Builder gameBuilder = new Game.Builder();
        gameBuilder
                .title("Minesweeper")
                .description("Don't click on the mines!")
                .rating(85)
                .review("Very addictive game.")
                .build();
        Game minesweeper = new Game(gameBuilder);
        assertEquals("game titles don't match", minesweeper.getTitle(), "Minesweeper");
        assertEquals("game desciption don't match", minesweeper.getDescription(), "Don't click on the mines!");
        assertEquals("game title don't match", minesweeper.getRating(), 85);
        assertEquals("game review don't match", minesweeper.getReview(), "Very addictive game.");
        System.out.println(minesweeper.toString());
    }
}
