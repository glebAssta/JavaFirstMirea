package ru.mirea.task2;

public class book {
    private String name;
    private String author;
    private int publishingYear;

    public book(String name, String author, int publishingYear) {
        this.name = name;
        if (this.name.length() == 0) this.name = "unknown";
        this.author = author;
        if (this.author.length() == 0) this.author = "unknown";
        this.publishingYear = publishingYear;
    }

    public book(String name, String author) {
        this.name = name;
        if (this.name.length() == 0) this.name = "unknown";
        this.author = author;
        if (this.author.length() == 0) this.author = "unknown";
        this.publishingYear = 0;
    }

    public book(String name) {
        this.name = name;
        if (this.name.length() == 0) this.name = "unknown";
        this.author = "unknown";
        this.publishingYear = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Book {name = " + this.name + "; author = " + this.author + "; publishing year = " +
                this.publishingYear + "}";
    }
}