package org.example.pltw.medialib;

public class Book
{
    private int rating;
    private String title;
    private double price;

    /**
     * Constructor for objects of class Movie
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
    public Book(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }

    public double getPrice() {
        return price;
    }
}
