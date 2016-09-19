package com.ikosumi.designpatterns.builder;

public class Game {
    private String title;
    private String description;
    private int rating;
    private String review;

    private Game() { }

    public Game(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.rating = builder.rating;
        this.review = builder.review;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    static class Builder {
        private String title;
        private String description;
        private int rating;
        private String review;

        public Builder() { }

        public Game build() {
            return new Game(this);
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder review(String review) {
            this.review = review;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                '}';
    }
}
